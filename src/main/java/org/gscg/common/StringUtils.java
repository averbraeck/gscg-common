package org.gscg.common;

/**
 * StringUtils offers often used string utilities.
 * <p>
 * Copyright (c) 2025-2025 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-3-style license.
 * </p>
 * @author <a href="https://github.com/averbraeck">Alexander Verbraeck</a>
 */
public class StringUtils
{
    /**
     * substring() method that avoids IndexOutOfBoundsException.
     * @param text the text to cap
     * @param length the maximum length in characters
     * @return the potentially capped sting if in case it was longer than length; otherwise the original string
     */
    public static String substring(final String text, final int length)
    {
        if (text.length() <= length)
        {
            return text;
        }
        else
        {
            return text.substring(0, length);
        }
    }
}
