package dev.ultreon.gdx.c.samples;

import dev.ultreon.gdx.c.config.AssetFileHandle;
import dev.ultreon.gdx.c.config.TeaBuildConfiguration;
import dev.ultreon.gdx.c.config.TeaBuilder;
import dev.ultreon.gdx.c.gen.SkipClass;
import org.teavm.tooling.TeaVMSourceFilePolicy;
import org.teavm.tooling.TeaVMTargetType;
import org.teavm.tooling.TeaVMTool;
import org.teavm.tooling.sources.DirectorySourceFileProvider;
import org.teavm.tooling.sources.JarSourceFileProvider;
import org.teavm.vm.TeaVMOptimizationLevel;

import java.io.File;
import java.io.IOException;

/** Builds the TeaVM/HTML application. */
@SkipClass
public class NativeBuilder {
    public static void main(String[] args) throws IOException {
        TeaBuildConfiguration teaBuildConfiguration = new TeaBuildConfiguration();
        teaBuildConfiguration.assetsPath.add(new AssetFileHandle("../client/src/main/resources"));
        teaBuildConfiguration.targetDirectory = new File("build/generated/teavm/c").getCanonicalPath();

        // Register any extra classpath assets here:
        // teaBuildConfiguration.additionalAssetsClasspathFiles.add("dev/ultreon/asset.extension");

        // Register any classes or packages that require reflection here:
        // TeaReflectionSupplier.addReflectionClass("dev.ultreon.aero7.reflect");

        TeaVMTool tool = TeaBuilder.config(teaBuildConfiguration);
        tool.setMainClass(Main.class.getName());
        // For many (or most) applications, using the highest optimization won't add much to build time.
        // If your builds take too long, and runtime performance doesn't matter, you can change FULL to SIMPLE .
        tool.setOptimizationLevel(TeaVMOptimizationLevel.ADVANCED);
        tool.setTargetType(TeaVMTargetType.C);
        tool.setMaxHeapSize(536870912);
        tool.setObfuscated(true);
        tool.setShortFileNames(false);

        String sourceJars = System.getenv("SOURCE_JARS");
        if (sourceJars != null) {
            String[] split = sourceJars.split(File.pathSeparator);
            System.out.println("Adding " + split.length + " source jars");
            tool.getLog().info("Adding " + split.length + " source jars");
            for (String sourceJar : split) {
                System.out.println("Adding source jar: " + sourceJar);
                tool.getLog().info("Adding source jar: " + sourceJar);
                tool.addSourceFileProvider(new JarSourceFileProvider(new File(sourceJar)));
            }
        } else {
            System.out.println("No source jars found");
            tool.getLog().info("No source jars found");
        }
        TeaBuilder.build(tool);
    }
}
