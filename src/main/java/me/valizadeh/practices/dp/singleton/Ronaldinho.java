package me.valizadeh.practices.dp.singleton;

/**
 * @author valizadeh
 * @implNote
 * Implementation of Singleton Design Pattern.
 * Try to implicate the concept of Singleton Design Pattern.
 */
public final class Ronaldinho {

    private static volatile Ronaldinho oneAndOnly;

    private Ronaldinho() {
    }

    /**
     *
     * @return Ronaldinho the one and only instance of {@link Ronaldinho}
     */
    public static Ronaldinho oneAndOnly() {
        if (oneAndOnly == null) {
            synchronized (Ronaldinho.class) {
                if(oneAndOnly == null) {
                    oneAndOnly = new Ronaldinho();
                }
            }
        }
        return oneAndOnly;
    }

}
