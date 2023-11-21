# EyeIP

EyeIP is a [Fabric](https://fabricmc.net) mod that displays the IP address of the server you're connected to the F3 debug screen.

It targets Minecraft 1.20.2 and has no dependencies. It is automatically enabled when loaded. You can find the server's IP address by pressing `F3` in game and finding the text on the left that says `[EyeIP]`.

## What is `local:E:aabbccdd`?

You'll see that as the current address when connected to a single player world. Because of how Minecraft works when you run a single player world, it runs a local server in the background. The above address is not an IP address, but instead an ID for the local server.
