module jigsaw.service.impl.fresh {
    requires jigsaw.service;

    provides net.transgene.etudes.java9.service.StrongJavaService
            with net.transgene.etudes.java9.service.impl.fresh.FreshJavaService;
}