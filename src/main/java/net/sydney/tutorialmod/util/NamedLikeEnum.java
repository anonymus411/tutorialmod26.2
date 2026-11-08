package net.sydney.tutorialmod.util;

public interface NamedLikeEnum {

    String name();

    default String getLowercaseName() {
        return name().toLowerCase();
    }

}
