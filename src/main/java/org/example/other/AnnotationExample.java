package org.example.other;

import java.lang.annotation.*;

/**
 * Аннотация Info предназначена для предоставления метаданных классам.
 * <p>
 * Эта аннотация может использоваться для указания автора и версии класса.
 * Она применима только к классам и должна сохраняться во время выполнения, чтобы
 * ее можно было использовать через рефлексию.
 * </p>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Info {
}