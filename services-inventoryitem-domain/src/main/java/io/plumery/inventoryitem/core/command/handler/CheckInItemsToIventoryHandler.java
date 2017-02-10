package io.plumery.inventoryitem.core.command.handler;

import io.plumery.core.CommandHandler;
import io.plumery.core.infrastructure.Repository;
import io.plumery.inventoryitem.core.command.CheckInItemsToInventory;
import io.plumery.inventoryitem.core.domain.InventoryItem;

public class CheckInItemsToIventoryHandler implements CommandHandler<CheckInItemsToInventory> {
    private Repository<InventoryItem> repository;

    public CheckInItemsToIventoryHandler(Repository<InventoryItem> repository) {
        this.repository = repository;
    }

    @Override
    public void handle(CheckInItemsToInventory command) {
        InventoryItem item = repository.getById(command.inventoryItemId);
        item.checkIn(command.count);
        repository.save(item, command.originalVersion);
    }
}
