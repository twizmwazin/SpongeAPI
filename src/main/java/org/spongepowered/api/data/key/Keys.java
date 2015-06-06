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
package org.spongepowered.api.data.key;

import org.spongepowered.api.data.manipulator.block.*;
import org.spongepowered.api.data.type.*;
import org.spongepowered.api.util.Axis;
import org.spongepowered.api.util.Direction;

import java.util.Map;
import java.util.Set;

public final class Keys {
    private Keys() {}

    /**
     * @see AttachedData#attached()
     */
    public static final Key<Boolean> ATTACHED = null;

    /**
     * @see AxisData#axis()
     */
    public static final Key<Axis> AXIS = null;

    /**
     * @see BigMushroomData#type()
     */
    public static final Key<BigMushroomType> BIG_MUSHROOM_TYPE = null;

    /**
     * @see BrickData#type()
     */
    public static final Key<BrickType> BRICK_TYPE = null;

    /**
     * @see ComparatorData#type()
     */
    public static final Key<ComparatorData> COMPARATOR_TYPE = null;

    /**
     * @see ConnectedDirectionData#connectedDirections()
     */
    public static final Key<Set<Direction>> CONNECTED_DIRECTIONS = null;

    /**
     * @see ConnectedDirectionData#connectedNorth()
     */
    public static final Key<Boolean> CONNECTED_NORTH = null;

    /**
     * @see ConnectedDirectionData#connectedSouth()
     */
    public static final Key<Boolean> CONNECTED_SOUTH = null;

    /**
     * @see ConnectedDirectionData#connectedEast()
     */
    public static final Key<Boolean> CONNECTED_EAST = null;

    /**
     * @see ConnectedDirectionData#connectedWest()
     */
    public static final Key<Boolean> CONNECTED_WEST = null;

    /**
     * @see DecayableData#decayable()
     */
    public static final Key<Boolean> DECAYABLE = null;

    /**
     * @see DirectionalData#direction()
     */
    public static final Key<Direction> DIRECTION = null;

    /**
     * @see DirtData#type()
     */
    public static final Key<DirtType> DIRT_TYPE = null;

    /**
     * @see DisarmedData#disarmed()
     */
    public static final Key<Boolean> DISARMED = null;

    /**
     * @see DisguisedBlockData#type()
     */
    public static final Key<DisguisedBlockType> DISGUISED_BLOCK_TYPE = null;

    /**
     * @see DoublePlantData#type()
     */
    public static final Key<DoublePlantType> DOUBLE_PLANT_TYPE = null;

    /**
     * @see DropData#willDrop()
     */
    public static final Key<Boolean> SHOULD_DROP = null;

    /**
     * @see ExtendedData#extended()
     */
    public static final Key<Boolean> EXTENDED = null;

    /**
     * @see FilledData#filled()
     */
    public static final Key<Boolean> FILLED = null;

    /**
     * @see FluidLevelData#level()
     */
    public static final Key<Integer> FLUID_LEVEL = null;

    /**
     * @see GrowthData#growthStage()
     */
    public static final Key<Integer> GROWTH_STAGE = null;

    /**
     * @see HingeData#position()
     */
    public static final Key<Hinge> HINGE_POSITION = null;

    /**
     * @see InstrumentData#type()
     */
    public static final Key<InstrumentType> INSTRUMENT_TYPE = null;

    /**
     * @see InWallData#inWall()
     */
    public static final Key<Boolean> IN_WALL = null;

    /**
     * @see LayeredData#layer()
     */
    public static final Key<Integer> LAYER = null;

    /**
     * @see MoistureData#moisture()
     */
    public static final Key<Integer> MOISTURE = null;

    /**
     * @see OccupiedData#occupied()
     */
    public static final Key<Boolean> OCCUPIED = null;

    /**
     * @see OpenData#open()
     */
    public static final Key<Boolean> OPEN = null;

    /**
     * @see PistonData#type()
     */
    public static final Key<PistonType> PISTON_TYPE = null;

    /**
     * @see PlantData#type()
     */
    public static final Key<PlantType> PLANT_TYPE = null;

    /**
     * @see PortionData#type()
     */
    public static final Key<PortionType> PORTION_TYPE = null;

    /**
     * @see PoweredData#powered()
     */
    public static final Key<Boolean> POWERED = null;

    /**
     * @see PrismarineData#type()
     */
    public static final Key<PrismarineType> PRISMARINE_TYPE = null;

    /**
     * @see QuartzData#type()
     */
    public static final Key<QuartzType> QUARTZ_TYPE = null;

    /**
     * @see RailDirectionData#railDirection()
     */
    public static final Key<RailDirection> RAIL_DIRECTION = null;

    /**
     * @see RedstonePoweredData#power()
     */
    public static final Key<Integer> POWER = null;

    /**
     * @see SandData#type()
     */
    public static final Key<SandType> SAND_TYPE = null;

    /**
     * @see SandstoneData#type()
     */
    public static final Key<SandstoneType> SANDSTONE_TYPE = null;

    /**
     * @see SeamlessData#seamless()
     */
    public static final Key<Boolean> SEAMLESS = null;

    /**
     * @see ShrubData#type()
     */
    public static final Key<ShrubType> SHRUB_TYPE = null;

    /**
     * @see SignalOutputData#signalOutput()
     */
    public static final Key<Integer> SIGNAL_OUTPUT = null;

    /**
     * @see SlabData#type()
     */
    public static final Key<SlabType> SLAB_TYPE = null;

    /**
     * @see SnowedData#hasSnow()
     */
    public static final Key<Boolean> HAS_SNOW = null;

    /**
     * @see StairShapeData#shape()
     */
    public static final Key<StairShape> STAIR_SHAPE = null;

    /**
     * @see StoneData#type()
     */
    public static final Key<StoneType> STONE_TYPE = null;

    /**
     * @see SuspendedData#suspended()
     */
    public static final Key<Boolean> SUSPENDED = null;

    /**
     * @see TreeData#type()
     */
    public static final Key<TreeType> TREE_TYPE = null;

    /**
     * @see WallData#type()
     */
    public static final Key<WallType> WALL_TYPE = null;

    /**
     * @see WireAttachmentData#wireAttachment()
     */
    public static final Key<Map<Direction, WireAttachmentType>> WIRE_ATTACHMENTS = null;

    /**
     * @see WireAttachmentData#wireAttachmentNorth()
     */
    public static final Key<WireAttachmentType> WIRE_ATTACHMENT_NORTH = null;

    /**
     * @see WireAttachmentData#wireAttachmentNorth()
     */
    public static final Key<WireAttachmentType> WIRE_ATTACHMENT_SOUTH = null;

    /**
     * @see WireAttachmentData#wireAttachmentNorth()
     */
    public static final Key<WireAttachmentType> WIRE_ATTACHMENT_EAST = null;

    /**
     * @see WireAttachmentData#wireAttachmentNorth()
     */
    public static final Key<WireAttachmentType> WIRE_ATTACHMENT_WEST = null;

}
