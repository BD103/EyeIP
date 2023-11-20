package io.github.bd103.eyeip

import net.fabricmc.api.ClientModInitializer
import org.slf4j.LoggerFactory
import java.net.SocketAddress

object EyeIP : ClientModInitializer {
	val logger = LoggerFactory.getLogger("eyeip")
	var currentAddress: SocketAddress? = null

	override fun onInitializeClient() {
		logger.info("Initializing EyeIP")
	}
}
