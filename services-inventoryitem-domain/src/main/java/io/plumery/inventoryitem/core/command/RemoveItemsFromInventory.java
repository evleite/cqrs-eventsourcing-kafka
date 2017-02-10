package io.plumery.inventoryitem.core.command;

import io.plumery.core.Command;
import io.plumery.core.ID;

public class RemoveItemsFromInventory extends Command {
    public final ID inventoryItemId;
    public final Integer count;

    public RemoveItemsFromInventory(ID inventoryItemId, Integer count, Integer originalVersion) {
        this.inventoryItemId = inventoryItemId;
        this.count = count;
        this.originalVersion = originalVersion;
    }
}
