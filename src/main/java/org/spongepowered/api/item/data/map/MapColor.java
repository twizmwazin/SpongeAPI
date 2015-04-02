/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.spongepowered.api.item.data.map;


import java.awt.Color;

/**
 * Represents a color on a map.
 */
public interface MapColor {
    /**
     * Gets the RGB color that this {@link MapColor} will be displayed as on a client.
     *
     * @return The {@link Color} representation of this color.
     */
    Color getRGBColor();

    /**
     * Gets the base {@link MapColor} for this specific offset. Will be the same instance
     * if this instance is the base color.
     *
     * @return The base {@link MapColor} this instance is offset from.
     */
    MapColor getBaseColor();

    /**
     * Gets the shade modifier applied to this {@link MapColor}'s base color
     * when displayed by the client. Shades are numbered from 0 to 3 inclusive
     * and represent the following modifications to the base RGB values.
     *
     * After multipliers are applied the value is divided by 255 and rounded
     * to the nearest whole number.
     *
     * Shades:
     * 0 - Multiply RGB by 180 each.
     * 1 - Multiply RGB by 220 each.
     * 2 - Multiply RGB by 255 each, leading to the same color as the base.
     * 3 - Multiply RGB by 135 each.
     *
     * @return The shade modifier to the base color.
     */
    int getShade();


    /**
     * Computes a {@link MapColor} from this {@link MapColor}'s base and uses
     * the shade provided to create another shade of this {@link MapColor}.
     *
     * See {@link #getShade()} for details of what the shade modifier represents
     * and the valid shade modifiers to use.
     *
     * @param shade The shade modifier
     * @return The a new {@link MapColor} with the selected shade modifier
     */
    MapColor createShaded(int shade);

    /**
     * Gets the raw map palette index for advanced manipulation.
     *
     * @return The index suitable for raw manipulation of map colors.
     */
    byte getIndex();
}
