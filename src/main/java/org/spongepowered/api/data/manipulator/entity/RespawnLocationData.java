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
package org.spongepowered.api.data.manipulator.entity;

import com.flowpowered.math.vector.Vector3d;
import com.google.common.base.Optional;
import org.spongepowered.api.data.manipulator.MappedData;

import java.util.UUID;

import javax.annotation.Nullable;

/**
 * Represents the locations for where a player will respawn in different worlds.
 */
public interface RespawnLocationData extends MappedData<UUID, Vector3d, RespawnLocationData> {

    /**
     * Gets the position the player will respawn in the given world, or absent
     * if no position is assigned for that world.
     *
     * @param worldUuid The world to get the position in
     * @return The respawn position in the world, if available
     * @throws IllegalArgumentException If the UUID is not a known world UUID
     */
    Optional<Vector3d> getRespawnPosition(UUID worldUuid);

    /**
     * Sets the position the player will respawn in, in the given world. Passing
     * <code>null</code> will clear the position for the world.
     *
     * @param worldUuid The world to set the position in
     * @param position The position within the world the player will respawn at
     * @return This instance, for chaining
     * @throws IllegalArgumentException If the UUID is not a known world UUID
     */
    RespawnLocationData setRespawnPosition(UUID worldUuid, @Nullable Vector3d position);

}
