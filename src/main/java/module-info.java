/* ########################################################################## */
/*                                                                            */
/*  SPDX-License-Identifier: UNLICENSED                                       */
/*  See LICENSE.txt for full license terms (FR/EN).                           */
/*                                                                            */
/*  Author: Charles Theetten                                                  */
/*                                                                            */
/* ########################################################################## */

module spaceinvaders {
    requires            java.base;

    requires transitive javafx.graphics;

    requires            javafx.base;
    requires            javafx.controls;
    requires            javafx.media;

    exports             io.chasthn.spaceinvaders;
}

/* ########################################################################## */
