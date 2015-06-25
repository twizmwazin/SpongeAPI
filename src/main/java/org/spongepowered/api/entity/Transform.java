/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
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
package org.spongepowered.api.entity;

import com.flowpowered.math.vector.Vector3d;
import com.flowpowered.math.vector.Vector3f;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

/**
 * Represents the world attributes of an {@link Entity}. Comprised of {@link Location}, {@link Vector3f} representing the rotation, and a float
 * representing the scale.
 */
public interface Transform {

    /**
     * Gets the {@link Location} this transform contains.
     * @return The location
     */
    Location getLocation();

    /**
     * Sets the {@link Location} of this transform.
     * @param location The new location
     * @return This object, for chaining
     */
    Transform setLocation(Location location);

    /**
     * Gets the coordinates of this transform, as a {@link Vector3d}
     * @return The coordinates
     */
    Vector3d getPosition();

    /**
     * Sets the coordinates of this transform.
     * <p>
     * Note: This will construct a new {@link Location} object.
     * @param position The new position
     * @return The object, for chaining
     */
    Transform setPosition(Vector3d position);

    /**
     * Gets the rotation of this transform, as a {@link Vector3f}.
     *
     * <p>The format of the rotation is represented by:</p>
     *
     * <ul><code>x -> yaw</code>, <code>y -> pitch</code>, <code>z -> roll
     * </code></ul>
     * @return The rotation vector
     */
    Vector3f getRotation();

    /**
     * Sets the rotation of this transform.
     *
     * <p>The format of the rotation is represented by:</p>
     *
     * <ul><code>x -> yaw</code>, <code>y -> pitch</code>, <code>z -> roll
     * </code></ul>
     * @param rotation The new rotation
     * @return This object, for chaining
     */
    Transform setRotation(Vector3f rotation);

    /**
     * Gets the yaw component of this transform's rotation
     * @return The yaw
     */
    float getYaw();

    /**
     * Gets the pitch component of this transform's rotation
     * @return The pitch
     */
    float getPitch();

    /**
     * Gets the roll component of this transform's rotation
     * @return The roll
     */
    float getRoll();

    /**
     * Gets the scale of the transform.
     * @return The scale
     */
    float getScale();

    /**
     * Returns if this {@link Transform} is still valid.
     * <p>
     * Examples of invalid Transforms are:
     * - A Transform whose {@link World} object is no longer present
     * - A Transform whose coordinates are not legal. This is defined by the implementation.
     * @return True if valid, false if not
     */
    boolean isValid();
}
