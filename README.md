# EyeIP

[![Modrinth](https://img.shields.io/badge/Modrinth-gray?logo=modrinth) ![Mod Version](https://img.shields.io/modrinth/v/4ajskJKt) ![Game Version](https://img.shields.io/modrinth/game-versions/4ajskJKt)](https://modrinth.com/mod/eyeip)

EyeIP is a client-side [Fabric](https://fabricmc.net) mod that displays the IP address of the server you're connected to the F3 debug screen.

It targets Minecraft 1.20.2 and has no dependencies. It is automatically enabled when loaded. You can find the server's IP address by pressing `F3` in game and finding the text on the left that says `[EyeIP]`.

## What is `local:E:aabbccdd`?

You'll see that as the current address when connected to a single player world. Because of how Minecraft works when you run a single player world, it runs a local server in the background. The above address is not an IP address, but instead an ID for the local server.

## Why is my IP address not changing?

If you're playing on a large server like [Hypixel](https://hypixel.net), you may expect the IP address to change whenever you warp into a new game or switch servers. This is actually not the case because Hypixel uses a proxy server like [BungeeCord](https://github.com/SpigotMC/BungeeCord) to let you "warp" between servers without disconnecting and changing the address.

On the other hand, if your IP address is not changing when you leave / disconnect a world and connect to a **different** one, then it is a bug and I would appreciate it if you'd [report it](https://github.com/BD103/EyeIP/issues).
