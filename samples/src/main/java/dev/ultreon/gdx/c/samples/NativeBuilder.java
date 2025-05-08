package dev.ultreon.gdx.c.samples;

import dev.ultreon.gdx.c.config.AssetFileHandle;
import dev.ultreon.gdx.c.config.TeaBuildConfiguration;
import dev.ultreon.gdx.c.config.TeaBuilder;
import dev.ultreon.gdx.c.gen.SkipClass;
import org.teavm.tooling.TeaVMTargetType;
import org.teavm.tooling.TeaVMTool;
import org.teavm.tooling.sources.JarSourceFileProvider;
import org.teavm.vm.TeaVMOptimizationLevel;

import java.io.File;
import java.io.IOException;

/** Builds the TeaVM/HTML application. */
@SkipClass
public class NativeBuilder {
    public static void main(String[] args) throws IOException {
        TeaBuildConfiguration teaBuildConfiguration = new TeaBuildConfiguration();
        teaBuildConfiguration.assetsPath.add(new AssetFileHandle("src/main/resources"));
        teaBuildConfiguration.targetDirectory = new File("build/generated/teavm/c").getCanonicalPath();

        // Register any classes or packages that require reflection here:

        TeaVMTool tool = TeaBuilder.config(teaBuildConfiguration);
        tool.setMainClass(Main.class.getName());
        // For many (or most) applications, using the highest optimization won't add much to build time.
        // If your builds take too long, and runtime performance doesn't matter, you can change FULL to SIMPLE .
        tool.setOptimizationLevel(TeaVMOptimizationLevel.ADVANCED);
        tool.setTargetType(TeaVMTargetType.C);
        tool.setObfuscated(false);
        tool.setShortFileNames(false);
        tool.getProperties().setProperty("hostos.name", System.getProperty("os.name"));
        tool.getProperties().setProperty("hostos.arch", System.getProperty("os.arch"));

        TeaBuilder.build(tool);

    }
}
