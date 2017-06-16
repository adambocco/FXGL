/*
 * FXGL - JavaFX Game Library. The MIT License (MIT).
 * Copyright (c) AlmasB (almaslvl@gmail.com).
 * See LICENSE for details.
 */

package com.almasb.fxgl.app

/**
 * Runtime mode of the application.
 * Primarily affects how logging and exception reporting are handled.
 * Some services might show different behavior based on the mode.
 *
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 */
enum class ApplicationMode {

    /**
     * All logging levels and full exception stacktrace.
     */
    DEBUG,

    /**
     * Info / Warning / Fatal logging levels and full exception stacktrace.
     */
    DEVELOPER,

    /**
     * Fatal logging level and only exception message.
     * Services and the framework must attempt to maximize performance in this mode.
     */
    RELEASE
}