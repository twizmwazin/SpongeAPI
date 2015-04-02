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
import org.spongepowered.api.world.World;

import java.util.List;

/**
 * Represents the data connected to a map
 */
public interface MapData {
    /**
     * Gets the world associated with this map's display. Virtual maps may have
     * no world associated with them.
     *
     * @return The world for this map or absent if the map is virtual
     */
    Optional<World> getWorld();

    /**
     * Sets the world associated with this map's display.
     *
     * @param world The new world for this map
     */
    void setWorld(World world);


    /**
     * Gets the string identifier of the map that will be used by Minecraft to
     * represent this map. No guarantee in relation to stored map files on the
     * disk, however it will be unique across server startup and shutdown.
     *
     * @return This map's unique id
     */
    String getId();

    /**
     * Gets the scale value, this is currently restricted between 0 to 3 inclusive.
     * The scale value corresponds to 2^scale blocks per pixel and
     * defaults to 3 on vanilla maps.
     *
     * @return The map scale
     */
    int getScale();

    /**
     * Sets the scale value for a map.
     *
     * Refer to {@link #getScale()} for details on what the scale represents
     * and what values represent valid scales.
     *
     * @param scale The new scaling for this map
     */
    void setScale(int scale);

    /**
     * Gets the width in pixels of the map canvas.
     *
     * @return The width in pixels
     */
    int getWidth();

    /**
     * Gets the height in pixels of the map canvas.
     *
     * @return The height in pixels
     */
    int getHeight();

    /**
     * Gets a {@link Vector2i} representing the x and y coordinates of the
     * world position at the center of this map.
     *
     * @return The center of this map
     */
    Vector2i getCenter();

    /**
     * Sets the center of this map to the world x and y coordinates in the
     * supplied {@link Vector2i}.
     *
     * @param center The new center of this map
     */
    void setCenter(Vector2i center);

    /**
     * A virtual map is only backed by it's {@link MapRenderer}s and will not
     * have any relationship to the world.
     *
     * @return Is this map virtual
     */
    boolean isVirtual();

    /**
     * Gets all the {@link MapRenderer}s registered to this map.
     *
     * @return The registered {@link MapRenderer}s
     */
    List<MapRenderer> getAllRenderers();

    /**
     * Adds a new {@link MapRenderer} to this map.
     *
     * @param renderer The {@link MapRenderer} to add
     */
    void addMapRenderer(MapRenderer renderer);


    /**
     * Removes a {@link MapRenderer} from this map.
     *
     * @param renderer The {@link MapRenderer} to remove
     */
    void removeMapRenderer(MapRenderer renderer);

}
