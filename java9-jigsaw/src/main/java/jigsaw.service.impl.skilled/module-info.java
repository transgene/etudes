module jigsaw.service.impl.skilled {
    requires jigsaw.service;

    provides net.transgene.etudes.java9.service.StrongJavaService
            with net.transgene.etudes.java9.service.impl.skilled.SkilledJavaService;
}