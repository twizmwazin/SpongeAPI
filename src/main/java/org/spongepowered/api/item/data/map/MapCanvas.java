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

import com.flowpowered.math.vector.Vector2i;
import com.google.common.base.Optional;

import java.awt.Color;
import java.awt.Image;

/**
 * A class that represents the display of a map item.
 */
public interface MapCanvas {
    /**
     * Gets the {@link MapData} that this canvas is attached to.
     *
     * @return The {@link MapData} for this canvas
     */
    MapData getMapData();

    /**
     * Gets the {@link MapColor} at the specified pixel position. If the position
     * is invalid (out of range), the value will be absent. Pixels start at (0,0)
     * in the top-left corner and go to (width-1, height-1).
     *
     * @param x The x coordinate of the pixel to get
     * @param y The y coordinate of the pixel to get
     * @return The {@link MapColor} of the pixel if coordinates are valid
     */
    Optional<MapColor> getColorAt(int x, int y);


    /**
     * Gets the {@link MapColor} at the specified pixel position. If the position
     * is invalid (out of range), the value will be absent. Pixels start at (0,0)
     * in the top-left corner and go to (width-1, height-1).
     *
     * @param position The position of the pixel to get
     * @return The {@link MapColor} of the pixel if coordinates are valid
     */
    Optional<MapColor> getColorAt(Vector2i position);

    /**
     * Sets the {@link MapColor} at the specified pixel position. The color will
     * not be set if the position is out of bounds.
     *
     * Pixel locations follow the same rules as the {@link #getColorAt(int, int)} method.
     *
     * @param x The x coordinate of the pixel to set
     * @param y The y coordinate of the pixel to set
     * @param color The {@link MapColor} to set at the position
     */
    void setColorAt(int x, int y, MapColor color);

    /**
     * Sets the {@link MapColor} at the specified pixel position. The color will
     * not be set if the position is out of bounds.
     *
     * Pixel locations follow the same rules as the {@link #getColorAt(int, int)} method.
     *
     * @param position The position of the pixel to set
     * @param color The {@link MapColor} to set at the position
     */
    void setColorAt(Vector2i position, MapColor color);

    /**
     * Uses the color matching from {@link org.spongepowered.api.GameRegistry#matchColor(Color)} to
     * draw an {@link Image} to the map.
     *
     * @param x The x coordinate of the top-left corner
     * @param y The y coordinate of the top-right corner
     * @param width The width of the image that is drawn
     * @param height The height of the image that is drawn
     * @param image The {@link Image} to draw
     */
    void drawImage(int x, int y, int width, int height, Image image);

    /**
     * Provides access to the raw map colors, only use this if your plugin has
     * a special need to avoid built-in color matching methods. The pixels are
     * arranged in single-dimensional (row * width) + xOffset format. Each pixel
     * represents a byte index into the color palette array from
     * {@link org.spongepowered.api.GameRegistry#getCompleteMapColors() GameRegistry#getCompleteMapColors()};
     *
     * @return The mutable color array of this canvas
     */
    byte[] getRawPixels();
}
