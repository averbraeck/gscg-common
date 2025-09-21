package org.gscg.common;

import org.gscg.data.Tables;
import org.gscg.data.tables.records.UserRecord;
import org.jooq.Table;
import org.jooq.TableField;

/**
 * SqlUtils provides access to tables that are read often.
 * <p>
 * Copyright (c) 2025-2025 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-3-style license.
 * </p>
 * @author <a href="https://github.com/averbraeck">Alexander Verbraeck</a>
 */
public class SqlUtils
{

    public static UserRecord readUserFromUserId(final CommonData data, final int userId)
    {
        return data.getDSL().selectFrom(Tables.USER).where(Tables.USER.ID.eq(userId)).fetchAny();
    }

    public static UserRecord readUserFromUsername(final CommonData data, final String username)
    {
        return data.getDSL().selectFrom(Tables.USER).where(Tables.USER.NAME.eq(username)).fetchAny();
    }

    @SuppressWarnings("unchecked")
    public static <R extends org.jooq.UpdatableRecord<R>> R readRecordFromId(final CommonData data, final Table<R> table,
            final int recordId)
    {
        return data.getDSL().selectFrom(table).where(((TableField<R, Integer>) table.field("id")).eq(recordId)).fetchOne();
    }

}
