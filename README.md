### Install

Place the jar file in the ext/ directory of your gitblit installation.

Open your gitblt.properties file and add (or modify) this setting:

```
web.avatarClass = com.gitblit.ext.wavatar.WavatarGenerator
```

### Build

To build yourself, you must have the gitblit repository available. Add the following to the pom.xml if you don't have this repo in your maven settings already:
```
<repositories>
	<repository>
		<id>gitblit</id>
		<url>http://gitblit.github.io/gitblit-maven/</url>
	</repository>
</repositories>
```
