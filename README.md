# Scaling Goggle

Scaling Goggles is a minecraft mod that <does something>.

This is based on the recommended repository name when creating a new repository
on github.

## Development

Set up your workspace.

```
gradle setupDecompWorkspace --refresh-dependencies
```

Run the client

```
gradle runClient
```

Build the jar in `build/libs`
```
gradle build
```

### Troubleshooting

#### Fonts not rendered correctly on OSX

If the minecraft fonts are missing or displaying as blocky textures, edit the
`minecraft/config/splash.properties` file and set `enabled=false`.
