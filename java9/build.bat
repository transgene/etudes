@rem set PATH=c:\Coding\Java\jdk-14.0.1\bin

rmdir /s /q "build\modules"
javac -d build/modules --module-source-path src/main/java --module jigsaw.service,jigsaw.service.impl.skilled,jigsaw.service.impl.fresh,jigsaw.calc,jigsaw.main
