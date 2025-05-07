package dev.ultreon.gdx.c.config;

/**
 * @author xpenatan
 */
public class DefaultAssetFilter implements AssetFilter {
    @Override
    public boolean accept(String file, boolean isDirectory, AssetFilterOption op) {
        if(isDirectory && file.endsWith(".svn")) return false;
        if(file.endsWith(".jar")) return false;
        if(file.endsWith("assets.txt")) return false;
        return true;
    }
}