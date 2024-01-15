package com.andrei1058.bedwars.api.arena.team;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

public enum TeamColor {
    WHITE,
    ORANGE,
    MAGENTA,
    LIGHT_BLUE,
    YELLOW,
    LIME,
    PINK,
    GRAY,
    LIGHT_GRAY,
    CYAN,
    PURPLE,
    BLUE,
    BROWN,
    GREEN,
    RED,
    BLACK,
    AQUA;


    public static ChatColor getChatColor(@NotNull String tColor) {
        TeamColor teamColor = valueOf(tColor.toUpperCase());
        ChatColor color;
        if (teamColor == PINK) {
            color = ChatColor.LIGHT_PURPLE;
        } else if (teamColor == ORANGE) {
            color = ChatColor.GOLD;
        } else if (teamColor == PURPLE) {
            color = ChatColor.DARK_PURPLE;
        } else if (teamColor == MAGENTA) {
            color = ChatColor.DARK_PURPLE;
        } else if (teamColor == LIGHT_BLUE) {
            color = ChatColor.AQUA;
        } else if (teamColor == CYAN) {
                color = ChatColor.DARK_AQUA;
        } else if (teamColor == GRAY) {
            color = ChatColor.DARK_GRAY;
        }  else if (teamColor == LIGHT_GRAY) {
            color = ChatColor.GRAY;
        } else if (teamColor == BROWN) {
            color = ChatColor.DARK_RED;
        } else if (teamColor == GREEN) {
            color = ChatColor.DARK_GREEN;
        } else if (teamColor == LIME) {
            color = ChatColor.GREEN;
        } else if (teamColor == AQUA) {
            color = ChatColor.AQUA;
        } else {
            color = ChatColor.valueOf(teamColor.toString());
        }

        return color;
    }

    public ChatColor chat() {
        TeamColor teamColor = valueOf(this.toString());
        ChatColor color;
        if (teamColor == PINK) {
            color = ChatColor.LIGHT_PURPLE;
        } else if (teamColor == ORANGE) {
            color = ChatColor.GOLD;
        } else if (teamColor == PURPLE) {
            color = ChatColor.DARK_PURPLE;
        } else if (teamColor == MAGENTA) {
            color = ChatColor.DARK_PURPLE;
        } else if (teamColor == LIGHT_BLUE) {
            color = ChatColor.AQUA;
        } else if (teamColor == CYAN) {
            color = ChatColor.DARK_AQUA;
        } else if (teamColor == GRAY) {
            color = ChatColor.DARK_GRAY;
        }  else if (teamColor == LIGHT_GRAY) {
            color = ChatColor.GRAY;
        } else if (teamColor == BROWN) {
            color = ChatColor.DARK_RED;
        } else if (teamColor == GREEN) {
            color = ChatColor.DARK_GREEN;
        } else if (teamColor == LIME) {
            color = ChatColor.GREEN;
        } else if (teamColor == AQUA) {
            color = ChatColor.AQUA;
        } else {
            color = ChatColor.valueOf(teamColor.toString());
        }

        return color;
    }

    @Deprecated
    public static ChatColor getChatColor(TeamColor teamColor) {
        ChatColor color;
        if (teamColor == PINK) {
            color = ChatColor.LIGHT_PURPLE;
        } else if (teamColor == ORANGE) {
            color = ChatColor.GOLD;
        } else if (teamColor == PURPLE) {
            color = ChatColor.DARK_PURPLE;
        } else if (teamColor == MAGENTA) {
            color = ChatColor.DARK_PURPLE;
        } else if (teamColor == LIGHT_BLUE) {
            color = ChatColor.AQUA;
        } else if (teamColor == CYAN) {
            color = ChatColor.DARK_AQUA;
        } else if (teamColor == GRAY) {
            color = ChatColor.DARK_GRAY;
        }  else if (teamColor == LIGHT_GRAY) {
            color = ChatColor.GRAY;
        } else if (teamColor == BROWN) {
            color = ChatColor.DARK_RED;
        } else if (teamColor == GREEN) {
            color = ChatColor.DARK_GREEN;
        } else if (teamColor == LIME) {
            color = ChatColor.GREEN;
        } else if (teamColor == AQUA) {
            color = ChatColor.AQUA;
        } else {
            color = ChatColor.valueOf(teamColor.toString());
        }

        return color;
    }

    @Deprecated
    public static DyeColor getDyeColor(@NotNull String teamColor) {
        DyeColor color;
        switch(valueOf(teamColor.toUpperCase())) {
            case AQUA:
                color = DyeColor.CYAN;
                break;
            default:
                color = DyeColor.valueOf(teamColor.toUpperCase());
        }

        return color;
    }

    public DyeColor dye() {
        DyeColor color;
        switch(this) {
            case AQUA:
                color = DyeColor.CYAN;
                break;
            default:
                color = DyeColor.valueOf(this.toString());
        }

        return color;
    }

    @Deprecated
    public static byte itemColor(@NotNull TeamColor teamColor) {
        int i = 0;
        switch(teamColor) {
            case WHITE:
            default:
                break;
            case ORANGE:
                i = 1;
                break;
            case MAGENTA:
                i = 2;
                break;
            case LIGHT_BLUE, AQUA:
                i = 3;
                break;
            case LIME:
                i = 5;
                break;
            case YELLOW:
                i = 4;
                break;
            case PINK:
                i = 6;
                break;
            case GRAY:
                i = 7;
                break;
            case LIGHT_GRAY:
                i = 8;
                break;
            case CYAN:
                i = 9;
                break;
            case PURPLE:
                i = 10;
                break;
            case BLUE:
                i = 11;
                break;
            case BROWN:
                i = 12;
                break;
            case GREEN:
                i = 13;
                break;
            case RED:
                i = 14;
                break;
            case BLACK:
                i = 15;
        }

        return (byte)i;
    }

    public byte itemByte() {
        int i = 0;
        switch(this) {
            case WHITE:
            default:
                break;
            case ORANGE:
                i = 1;
                break;
            case MAGENTA:
                i = 2;
                break;
            case LIGHT_BLUE, AQUA:
                i = 3;
                break;
            case LIME:
                i = 5;
                break;
            case YELLOW:
                i = 4;
                break;
            case PINK:
                i = 6;
                break;
            case GRAY:
                i = 7;
                break;
            case LIGHT_GRAY:
                i = 8;
                break;
            case CYAN:
                i = 9;
                break;
            case PURPLE:
                i = 10;
                break;
            case BLUE:
                i = 11;
                break;
            case BROWN:
                i = 12;
                break;
            case GREEN:
                i = 13;
                break;
            case RED:
                i = 14;
                break;
            case BLACK:
                i = 15;
        }

        return (byte)i;
    }

    public static String enName(@NotNull String material) {
        if (material == null) {
            TeamColor.$$$reportNull$$$0(3);
        }
        String name = "";
        String next = "";
        switch (material.toUpperCase()) {
            case "PINK_WOOL": {
                name = "Pink";
                break;
            }
            case "RED_WOOL": {
                name = "Red";
                break;
            }
            case "ORANGE_WOOL": {
                name = "Orange";
                break;
            }
            case "BLUE_WOOL": {
                name = "Blue";
                break;
            }
            case "WHITE_WOOL": {
                name = "White";
                break;
            }
            case "LIGHT_BLUE_WOOL": {
                name = "Light_BLue";
                next = "Aqua";
                break;
            }
            case "LIME_WOOL": {
                name = "Lime";
                break;
            }
            case "YELLOW_WOOL": {
                name = "Yellow";
                break;
            }
            case "MAGENTA_WOOL": {
                name = "Magenta";
                break;
            }
            case "BLACK_WOOL": {
                name = "Black";
                break;
            }
            case "GREEN_WOOL": {
                name = "Green";
                break;
            }
            case "PURPLE_WOOL": {
                name = "Purple";
                break;
            }
            case "BROWN_WOOL": {
                name = "Brown";
                break;
            }
            case "LIGHT_GRAY_WOOL": {
                name = "Light_Gray";
                break;
            }
            case "GRAY_WOOL": {
                name = "Gray";
                break;
            }
            case "CYAN_WOOL": {
                name = "Cyan";
            }
        }
        return name + next;
    }


    public static String enName(byte b2) {
        String name = "";
        String next = "";
        switch (b2) {
            case 0: {
                name = "White";
                break;
            }
            default: {
                break;
            }
            case 1: {
                name = "Orange";
                break;
            }
            case 2: {
                name = "Magenta";
                break;
            }
            case 3: {
                name = "Light_Blue";
                next = "Aqua";
                break;
            }
            case 4: {
                name = "Yellow";
                break;
            }
            case 5: {
                name = "Lime";
                break;
            }
            case 6: {
                name = "Pink";
                break;
            }
            case 7: {
                name = "Gray";
                break;
            }
            case 8: {
                name = "Light_Gray";
                break;
            }
            case 9: {
                name = "Cyan";
                break;
            }
            case 10: {
                name = "Purple";
                break;
            }
            case 11: {
                name = "Blue";
                break;
            }
            case 12: {
                name = "Brown";
                break;
            }
            case 13: {
                name = "Green";
                break;
            }
            case 14: {
                name = "Red";
                break;
            }
            case 15: {
                name = "Black";
            }
        }
        return name + next;
    }

    @Deprecated
    public static Color getColor(@NotNull TeamColor teamColor) {
        if (teamColor == null) {
            TeamColor.$$$reportNull$$$0(4);
        }
        Color color = Color.fromBGR((int)255, (int)255, (int)0);
        switch (teamColor.ordinal()) {
            case 0: {
                color = Color.fromBGR((int)255, (int)255, (int)255);
                break;
            }
            case 1: {
                color = Color.fromBGR((int)0, (int)128, (int)255);
                break;
            }
            case 2: {
                color = Color.fromBGR((int)128, (int)0, (int)255);
                break;
            }
            case 3: {
                color = Color.fromBGR((int)255, (int)255, (int)0);
                break;
            }
            case 4: {
                color = Color.fromBGR((int)0, (int)255, (int)255);
                break;
            }
            case 5: {
                color = Color.fromBGR((int)0, (int)128, (int)0);
                break;
            }
            case 6: {
                color = Color.fromBGR((int)255, (int)0, (int)255);
                break;
            }
            case 7: {
                color = Color.fromBGR((int)80, (int)80, (int)80);
                break;
            }
            case 8: {
                color = Color.fromBGR((int)157, (int)157, (int)157);
                break;
            }
            case 9: {
                color = Color.fromBGR((int)128, (int)128, (int)0);
                break;
            }
            case 10: {
                color = Color.fromBGR((int)255, (int)0, (int)128);
                break;
            }
            case 11: {
                color = Color.fromBGR((int)255, (int)0, (int)0);
                break;
            }
            case 12: {
                color = Color.fromBGR((int)31, (int)92, (int)169);
                break;
            }
            case 13: {
                color = Color.fromBGR((int)0, (int)64, (int)0);
                break;
            }
            case 14: {
                color = Color.fromBGR((int)0, (int)0, (int)255);
                break;
            }
            case 15: {
                color = Color.fromBGR((int)0, (int)0, (int)0);
                break;
            }
            default: {
            }
        }
        return color;
    }

    public Color bukkitColor() {
        Color color = Color.fromBGR((int)255, (int)255, (int)0);
        switch (this.ordinal()) {
            case 0: {
                color = Color.fromBGR((int)255, (int)255, (int)255);
                break;
            }
            case 1: {
                color = Color.fromBGR((int)0, (int)128, (int)255);
                break;
            }
            case 2: {
                color = Color.fromBGR((int)128, (int)0, (int)255);
                break;
            }
            case 3: {
                color = Color.fromBGR((int)255, (int)255, (int)0);
                break;
            }
            case 4: {
                color = Color.fromBGR((int)0, (int)255, (int)255);
                break;
            }
            case 5: {
                color = Color.fromBGR((int)0, (int)128, (int)0);
                break;
            }
            case 6: {
                color = Color.fromBGR((int)255, (int)0, (int)255);
                break;
            }
            case 7: {
                color = Color.fromBGR((int)80, (int)80, (int)80);
                break;
            }
            case 8: {
                color = Color.fromBGR((int)157, (int)157, (int)157);
                break;
            }
            case 9: {
                color = Color.fromBGR((int)128, (int)128, (int)0);
                break;
            }
            case 10: {
                color = Color.fromBGR((int)255, (int)0, (int)128);
                break;
            }
            case 11: {
                color = Color.fromBGR((int)255, (int)0, (int)0);
                break;
            }
            case 12: {
                color = Color.fromBGR((int)31, (int)92, (int)169);
                break;
            }
            case 13: {
                color = Color.fromBGR((int)0, (int)64, (int)0);
                break;
            }
            case 14: {
                color = Color.fromBGR((int)0, (int)0, (int)255);
                break;
            }
            case 15: {
                color = Color.fromBGR((int)0, (int)0, (int)0);
                break;
            }
            default: {
            }
        }
        return color;
    }

    @Deprecated
    public static Material getBedBlock(@NotNull TeamColor teamColor) {
        String color = "RED_BED";
        switch(teamColor) {
            case LIME:
                color = "LIME_BED";
                break;
            case LIGHT_BLUE:
                color = "LIGHT_BLUE_BED";
                break;
            case GRAY:
                color = "GRAY_BED";
                break;
            case WHITE:
                color = "WHITE_BED";
                break;
            case PINK:
                color = "PINK_BED";
                break;
            case RED:
            default:
                break;
            case YELLOW:
                color = "YELLOW_BED";
                break;
            case BLUE:
                color = "BLUE_BED";
                break;
            case CYAN, AQUA:
                color = "CYAN_BED";
                break;
            case MAGENTA:
                color = "MAGENTA_BED";
                break;
            case LIGHT_GRAY:
                color = "LIGHT_GRAY_BED";
                break;
            case PURPLE:
                color = "PURPLE_BED";
                break;
            case BROWN:
                color = "BROWN_BED";
                break;
            case GREEN:
                color = "GREEN_BED";
                break;
            case BLACK:
                color = "BLACK_BED";
                break;
            case ORANGE:
                color = "ORANGE_BED";
        }

        return Material.valueOf(color);
    }

    public Material bedMaterial() {
        String color = "RED_BED";
        switch(this) {
            case LIME:
                color = "LIME_BED";
                break;
            case LIGHT_BLUE:
                color = "LIGHT_BLUE_BED";
                break;
            case GRAY:
                color = "GRAY_BED";
                break;
            case WHITE:
                color = "WHITE_BED";
                break;
            case PINK:
                color = "PINK_BED";
                break;
            case RED:
            default:
                break;
            case YELLOW:
                color = "YELLOW_BED";
                break;
            case BLUE:
                color = "BLUE_BED";
                break;
            case CYAN, AQUA:
                color = "CYAN_BED";
                break;
            case MAGENTA:
                color = "MAGENTA_BED";
                break;
            case LIGHT_GRAY:
                color = "LIGHT_GRAY_BED";
                break;
            case PURPLE:
                color = "PURPLE_BED";
                break;
            case BROWN:
                color = "BROWN_BED";
                break;
            case GREEN:
                color = "GREEN_BED";
                break;
            case BLACK:
                color = "BLACK_BED";
                break;
            case ORANGE:
                color = "ORANGE_BED";
        }

        return Material.valueOf(color);
    }

    @Deprecated
    public static Material getGlass(@NotNull TeamColor teamColor) {
        String color = "GLASS";
        switch(teamColor) {
            case LIME:
                color = "LIME_STAINED_GLASS";
                break;
            case LIGHT_BLUE:
                color = "LIGHT_BLUE_STAINED_GLASS";
                break;
            case GRAY:
                color = "GRAY_STAINED_GLASS";
                break;
            case WHITE:
                color = "WHITE_STAINED_GLASS";
                break;
            case PINK:
                color = "PINK_STAINED_GLASS";
                break;
            case RED:
                color = "RED_STAINED_GLASS";
                break;
            case YELLOW:
                color = "YELLOW_STAINED_GLASS";
                break;
            case BLUE:
                color = "BLUE_STAINED_GLASS";
                break;
            case CYAN, AQUA:
                color = "CYAN_STAINED_GLASS";
                break;
            case MAGENTA:
                color = "MAGENTA_STAINED_GLASS";
                break;
            case LIGHT_GRAY:
                color = "LIGHT_GRAY_STAINED_GLASS";
                break;
            case PURPLE:
                color = "PURPLE_STAINED_GLASS";
                break;
            case BROWN:
                color = "BROWN_STAINED_GLASS";
                break;
            case GREEN:
                color = "GREEN_STAINED_GLASS";
                break;
            case BLACK:
                color = "BLACK_STAINED_GLASS";
                break;
            case ORANGE:
                color = "ORANGE_STAINED_GLASS";
        }

        return Material.valueOf(color);
    }

    public Material glassMaterial() {
        String color = "GLASS";
        switch(this) {
            case LIME:
                color = "LIME_STAINED_GLASS";
                break;
            case LIGHT_BLUE:
                color = "LIGHT_BLUE_STAINED_GLASS";
                break;
            case GRAY:
                color = "GRAY_STAINED_GLASS";
                break;
            case WHITE:
                color = "WHITE_STAINED_GLASS";
                break;
            case PINK:
                color = "PINK_STAINED_GLASS";
                break;
            case RED:
                color = "RED_STAINED_GLASS";
                break;
            case YELLOW:
                color = "YELLOW_STAINED_GLASS";
                break;
            case BLUE:
                color = "BLUE_STAINED_GLASS";
                break;
            case CYAN, AQUA:
                color = "CYAN_STAINED_GLASS";
                break;
            case MAGENTA:
                color = "MAGENTA_STAINED_GLASS";
                break;
            case LIGHT_GRAY:
                color = "LIGHT_GRAY_STAINED_GLASS";
                break;
            case PURPLE:
                color = "PURPLE_STAINED_GLASS";
                break;
            case BROWN:
                color = "BROWN_STAINED_GLASS";
                break;
            case GREEN:
                color = "GREEN_STAINED_GLASS";
                break;
            case BLACK:
                color = "BLACK_STAINED_GLASS";
                break;
            case ORANGE:
                color = "ORANGE_STAINED_GLASS";
        }

        return Material.valueOf(color);
    }

    @Deprecated
    public static Material getGlassPane(@NotNull TeamColor teamColor) {
        String color = "GLASS";
        switch(teamColor) {
            case LIME:
                color = "LIME_STAINED_GLASS_PANE";
                break;
            case LIGHT_BLUE:
                color = "LIGHT_BLUE_STAINED_GLASS_PANE";
                break;
            case GRAY:
                color = "GRAY_STAINED_GLASS_PANE";
                break;
            case WHITE:
                color = "WHITE_STAINED_GLASS_PANE";
                break;
            case PINK:
                color = "PINK_STAINED_GLASS_PANE";
                break;
            case RED:
                color = "RED_STAINED_GLASS_PANE";
                break;
            case YELLOW:
                color = "YELLOW_STAINED_GLASS_PANE";
                break;
            case BLUE:
                color = "BLUE_STAINED_GLASS_PANE";
                break;
            case CYAN, AQUA:
                color = "CYAN_STAINED_GLASS_PANE";
                break;
            case MAGENTA:
                color = "MAGENTA_STAINED_GLASS_PANE";
                break;
            case LIGHT_GRAY:
                color = "LIGHT_GRAY_STAINED_GLASS_PANE";
                break;
            case PURPLE:
                color = "PURPLE_STAINED_GLASS_PANE";
                break;
            case BROWN:
                color = "BROWN_STAINED_GLASS_PANE";
                break;
            case GREEN:
                color = "GREEN_STAINED_GLASS_PANE";
                break;
            case BLACK:
                color = "BLACK_STAINED_GLASS_PANE";
                break;
            case ORANGE:
                color = "ORANGE_STAINED_GLASS_PANE";
        }

        return Material.valueOf(color);
    }

    public Material glassPaneMaterial() {
        String color = "GLASS";
        switch(this) {
            case LIME:
                color = "LIME_STAINED_GLASS_PANE";
                break;
            case LIGHT_BLUE:
                color = "LIGHT_BLUE_STAINED_GLASS_PANE";
                break;
            case GRAY:
                color = "GRAY_STAINED_GLASS_PANE";
                break;
            case WHITE:
                color = "WHITE_STAINED_GLASS_PANE";
                break;
            case PINK:
                color = "PINK_STAINED_GLASS_PANE";
                break;
            case RED:
                color = "RED_STAINED_GLASS_PANE";
                break;
            case YELLOW:
                color = "YELLOW_STAINED_GLASS_PANE";
                break;
            case BLUE:
                color = "BLUE_STAINED_GLASS_PANE";
                break;
            case CYAN, AQUA:
                color = "CYAN_STAINED_GLASS_PANE";
                break;
            case MAGENTA:
                color = "MAGENTA_STAINED_GLASS_PANE";
                break;
            case LIGHT_GRAY:
                color = "LIGHT_GRAY_STAINED_GLASS_PANE";
                break;
            case PURPLE:
                color = "PURPLE_STAINED_GLASS_PANE";
                break;
            case BROWN:
                color = "BROWN_STAINED_GLASS_PANE";
                break;
            case BLACK:
                color = "BLACK_STAINED_GLASS_PANE";
                break;
            case GREEN:
                color = "GREEN_STAINED_GLASS_PANE";
                break;
            case ORANGE:
                color = "ORANGE_STAINED_GLASS_PANE";
        }

        return Material.valueOf(color);
    }

    @Deprecated
    public static Material getGlazedTerracotta(@NotNull TeamColor teamColor) {
        String color = "ORANGE_TERRACOTTA";
        switch(teamColor) {
            case LIME:
                color = "LIME_TERRACOTTA";
                break;
            case LIGHT_BLUE:
                color = "LIGHT_BLUE_TERRACOTTA";
                break;
            case GRAY:
                color = "GRAY_TERRACOTTA";
                break;
            case WHITE:
                color = "WHITE_TERRACOTTA";
                break;
            case PINK:
                color = "PINK_TERRACOTTA";
                break;
            case RED:
                color = "RED_TERRACOTTA";
                break;
            case YELLOW:
                color = "YELLOW_TERRACOTTA";
                break;
            case BLUE:
                color = "BLUE_TERRACOTTA";
                break;
            case CYAN, AQUA:
                color = "CYAN_TERRACOTTA";
                break;
            case MAGENTA:
                color = "MAGENTA_TERRACOTTA";
                break;
            case LIGHT_GRAY:
                color = "LIGHT_GRAY_TERRACOTTA";
                break;
            case PURPLE:
                color = "PURPLE_TERRACOTTA";
                break;
            case BROWN:
                color = "BROWN_TERRACOTTA";
                break;
            case GREEN:
                color = "GREEN_TERRACOTTA";
                break;
            case BLACK:
                color = "BLACK_TERRACOTTA";
                break;
            case ORANGE:
            default:
        }

        return Material.valueOf(color);
    }

    public Material glazedTerracottaMaterial() {
        String color = "ORANGE_TERRACOTTA";
        switch(this) {
            case LIME:
                color = "LIME_TERRACOTTA";
                break;
            case LIGHT_BLUE:
                color = "LIGHT_BLUE_TERRACOTTA";
                break;
            case GRAY:
                color = "GRAY_TERRACOTTA";
                break;
            case WHITE:
                color = "WHITE_TERRACOTTA";
                break;
            case PINK:
                color = "PINK_TERRACOTTA";
                break;
            case RED:
                color = "RED_TERRACOTTA";
                break;
            case YELLOW:
                color = "YELLOW_TERRACOTTA";
                break;
            case BLUE:
                color = "BLUE_TERRACOTTA";
                break;
            case CYAN, AQUA:
                color = "CYAN_TERRACOTTA";
                break;
            case MAGENTA:
                color = "MAGENTA_TERRACOTTA";
                break;
            case LIGHT_GRAY:
                color = "LIGHT_GRAY_TERRACOTTA";
                break;
            case PURPLE:
                color = "PURPLE_TERRACOTTA";
                break;
            case BROWN:
                color = "BROWN_TERRACOTTA";
                break;
            case GREEN:
                color = "GREEN_TERRACOTTA";
                break;
            case BLACK:
                color = "BLACK_TERRACOTTA";
                break;
            case ORANGE:
            default:
        }

        return Material.valueOf(color);
    }

    @Deprecated
    public static Material getWool(@NotNull TeamColor teamColor) {
        String color = "WHITE_WOOL";
        switch(teamColor) {
            case LIME:
                color = "LIME_WOOL";
                break;
            case LIGHT_BLUE:
                color = "LIGHT_BLUE_WOOL";
                break;
            case GRAY:
                color = "GRAY_WOOL";
                break;
            case WHITE:
            default:
                break;
            case PINK:
                color = "PINK_WOOL";
                break;
            case RED:
                color = "RED_WOOL";
                break;
            case YELLOW:
                color = "YELLOW_WOOL";
                break;
            case BLUE:
                color = "BLUE_WOOL";
                break;
            case CYAN, AQUA:
                color = "CYAN_WOOL";
                break;
            case MAGENTA:
                color = "MAGENTA_WOOL";
                break;
            case LIGHT_GRAY:
                color = "LIGHT_GRAY_WOOL";
                break;
            case PURPLE:
                color = "PURPLE_WOOL";
                break;
            case BROWN:
                color = "BROWN_WOOL";
                break;
            case BLACK:
                color = "BLACK_WOOL";
                break;
            case GREEN:
                color = "GREEN_WOOL";
                break;
            case ORANGE:
                color = "ORANGE_WOOL";
        }

        return Material.valueOf(color);
    }

    public Material woolMaterial() {
        String color = "WHITE_WOOL";
        switch(this) {
            case LIME:
                color = "LIME_WOOL";
                break;
            case LIGHT_BLUE:
                color = "LIGHT_BLUE_WOOL";
                break;
            case GRAY:
                color = "GRAY_WOOL";
                break;
            case WHITE:
            default:
                break;
            case PINK:
                color = "PINK_WOOL";
                break;
            case RED:
                color = "RED_WOOL";
                break;
            case YELLOW:
                color = "YELLOW_WOOL";
                break;
            case BLUE:
                color = "BLUE_WOOL";
                break;
            case CYAN, AQUA:
                color = "CYAN_WOOL";
                break;
            case MAGENTA:
                color = "MAGENTA_WOOL";
                break;
            case LIGHT_GRAY:
                color = "LIGHT_GRAY_WOOL";
                break;
            case PURPLE:
                color = "PURPLE_WOOL";
                break;
            case BROWN:
                color = "BROWN_WOOL";
                break;
            case BLACK:
                color = "BLACK_WOOL";
                break;
            case GREEN:
                color = "GREEN_WOOL";
                break;
            case ORANGE:
                color = "ORANGE_WOOL";
        }

        return Material.valueOf(color);
    }

    private static TeamColor[] $values() {
        return new TeamColor[]{WHITE, ORANGE, MAGENTA, LIGHT_BLUE, YELLOW, LIME, PINK, GRAY, LIGHT_GRAY, CYAN, PURPLE, BLUE, BROWN, GREEN, RED, BLACK, AQUA};
    }

    private static /* synthetic */ TeamColor[] $values$() {
        return new TeamColor[]{WHITE, ORANGE, MAGENTA, LIGHT_BLUE, YELLOW, LIME, PINK, GRAY, LIGHT_GRAY, CYAN, PURPLE, BLUE, BROWN, GREEN, RED, BLACK, AQUA};
    }



    private static /* synthetic */ void $$$reportNull$$$0(int n) {
        Object[] objectArray;
        Object[] objectArray2;
        Object[] objectArray3 = new Object[3];
        switch (n) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "tColor";
                break;
            }
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: {
                objectArray2 = objectArray3;
                objectArray3[0] = "teamColor";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "material";
                break;
            }
        }
        objectArray2[1] = "com/andrei1058/bedwars/api/arena/team/TeamColor";
        switch (n) {
            default: {
                objectArray = objectArray2;
                objectArray2[2] = "getChatColor";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[2] = "getDyeColor";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[2] = "itemColor";
                break;
            }
            case 3: {
                objectArray = objectArray2;
                objectArray2[2] = "enName";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[2] = "getColor";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[2] = "getBedBlock";
                break;
            }
            case 6: {
                objectArray = objectArray2;
                objectArray2[2] = "getGlass";
                break;
            }
            case 7: {
                objectArray = objectArray2;
                objectArray2[2] = "getGlassPane";
                break;
            }
            case 8: {
                objectArray = objectArray2;
                objectArray2[2] = "getGlazedTerracotta";
                break;
            }
            case 9: {
                objectArray = objectArray2;
                objectArray2[2] = "getWool";
                break;
            }
        }
    }
}
