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
package org.spongepowered.api.data.value.mutable;

import org.spongepowered.api.data.meta.PatternLayer;
import org.spongepowered.api.data.type.BannerPatternShape;
import org.spongepowered.api.data.type.DyeColor;
import org.spongepowered.api.data.value.immutable.ImmutablePatternListValue;

import java.util.List;

/**
 * Represents a customized {@link CollectionValue} handling
 * {@link PatternLayer}s. Virtually, this is the same as a {@link ListValue};
 * however, the core difference is the ability to add a
 * {@link BannerPatternShape} and {@link DyeColor} to create a new
 * {@link PatternLayer} to add.
 */
public interface PatternListValue extends CollectionValue<PatternLayer, List<PatternLayer>, PatternListValue, ImmutablePatternListValue> {

    BannerPatternShape get(int index);

    PatternListValue add(BannerPatternShape patternShape, DyeColor color);

    PatternListValue add(int index, BannerPatternShape patternShape, DyeColor color);

    PatternListValue add(int index, PatternLayer value);

    PatternListValue add(int index, Iterable<PatternLayer> values);

    PatternListValue remove(int index);

    PatternListValue set(int index, PatternLayer element);

    int indexOf(PatternLayer element);


}
