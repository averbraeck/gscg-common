package org.gscg.common;

/**
 * Access to a table or part of the database.
 * <p>
 * Copyright (c) 2025-2025 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-3-style license.
 * </p>
 * @author <a href="https://github.com/averbraeck">Alexander Verbraeck</a>
 */
public enum Access
{
    /** Admin access. */
    ADMIN,

    /** Create / delete access. */
    CREATE,

    /** Edit access. */
    EDIT,

    /** View access. */
    VIEW,

    /** No access. */
    NONE;

    public boolean admin()
    {
        return this.equals(ADMIN);
    }

    public boolean create()
    {
        return this.equals(ADMIN) || this.equals(CREATE);
    }

    public boolean edit()
    {
        return this.equals(ADMIN) || this.equals(CREATE) || this.equals(EDIT);
    }

    public boolean view()
    {
        return !this.equals(NONE);
    }

    public boolean none()
    {
        return this.equals(NONE);
    }
}
