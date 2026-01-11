package ru.sf.personalfinancemanagementsystem.utils;

import lombok.experimental.UtilityClass;

import java.util.Objects;
import java.util.function.Supplier;


@UtilityClass
public final class Checks {

    private static final Chain CHAIN = new Chain();


    public static Chain check(
            boolean ok,
            Supplier<? extends RuntimeException> exceptionSupplier
    ) {
        return CHAIN.check(ok, exceptionSupplier);
    }


    public static Chain begin() {
        return CHAIN;
    }


    public static final class Chain {

        public Chain check(
                boolean ok,
                Supplier<? extends RuntimeException> exceptionSupplier
        ) {
            if (ok) {
                throw exceptionSupplier.get();
            }
            return this;
        }

    }

}
