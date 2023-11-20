package io.github.bd103.eyeip;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.SocketAddress;

public class EyeIP implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("eyeip");
    public static SocketAddress currentAddress = null;

    @Override
    public void onInitializeClient() {}
}
