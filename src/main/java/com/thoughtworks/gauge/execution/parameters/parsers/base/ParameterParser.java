// Copyright 2019 ThoughtWorks, Inc.

// This file is part of Gauge-Java.

// This program is free software.
//
// It is dual-licensed under:
// 1) the GNU General Public License as published by the Free Software Foundation,
// either version 3 of the License, or (at your option) any later version;
// or
// 2) the Eclipse Public License v1.0.
//
// You can redistribute it and/or modify it under the terms of either license.
// We would then provide copied of each license in a separate .txt file with the name of the license as the title of the file.

package com.thoughtworks.gauge.execution.parameters.parsers.base;

import com.thoughtworks.gauge.execution.parameters.ParsingException;
import gauge.messages.Spec.Parameter;

public interface ParameterParser {
    boolean canParse(Class<?> parameterType, Parameter parameter);

    Object parse(Class<?> parameterType, Parameter parameter) throws ParsingException;
}
