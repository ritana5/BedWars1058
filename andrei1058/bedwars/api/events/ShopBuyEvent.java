package com.andrei1058.bedwars.api.events;

import com.andrei1058.bedwars.shop.BuyItemsAction;
import com.andrei1058.bedwars.shop2.main.CategoryContent;
import com.andrei1058.bedwars.shop2.main.ShopCategory;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ShopBuyEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private Player buyer;
    private ShopCategory shopCategory;
    private CategoryContent categoryContent;

    /**
     * Triggered when someone buys from the shop
     *
     * @since API v8
     */
    @Deprecated
    public ShopBuyEvent(BuyItemsAction buyItemsAction, Player buyer) {
        this.buyer = buyer;
    }

    /**
     * Triggered when a player buys from the shop
     *
     * @since API 12
     */
    public ShopBuyEvent(Player buyer, ShopCategory shopCategory, CategoryContent categoryContent) {
        this.shopCategory = shopCategory;
        this.categoryContent = categoryContent;
        this.buyer = buyer;
    }


    /**
     * Get some stuff about purchase
     * DEPRECATED
     * RETURNS NULL
     *
     * @return NULL
     * @since API v8
     */
    @Deprecated
    public BuyItemsAction getBuyItemsAction() {
        return null;
    }

    /**
     * Get the buyer
     *
     * @since API v8
     */
    public Player getBuyer() {
        return buyer;
    }

    /**
     * Get the shop category content bought
     *
     * @since API 12
     */
    public CategoryContent getCategoryContent() {
        return categoryContent;
    }

    /**
     * Get the shop category where the player bought from
     *
     * @since API 12
     */
    public ShopCategory getShopCategory() {
        return shopCategory;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
