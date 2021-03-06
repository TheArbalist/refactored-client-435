package com.jagex.runescape;

import com.jagex.runescape.cache.def.IdentityKit;
import com.jagex.runescape.cache.def.VarbitDefinition;
import com.jagex.runescape.cache.media.AnimationSequence;
import com.jagex.runescape.cache.media.SpotAnimDefinition;
import com.jagex.runescape.cache.media.TypeFace;
import com.jagex.runescape.collection.Node;
import com.jagex.runescape.media.VertexNormal;
import com.jagex.runescape.media.renderable.Model;
import com.jagex.runescape.media.renderable.Renderable;
import com.jagex.runescape.media.renderable.actor.Actor;
import com.jagex.runescape.media.renderable.actor.Npc;
import com.jagex.runescape.media.renderable.actor.Player;

public class Class40_Sub5_Sub17_Sub6 extends Renderable {
    public static int anInt3232;
    public static int anInt3234;
    public static TypeFace aClass40_Sub5_Sub14_Sub1_3236;
    public static int[][] playerColours = {{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193}, {8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239}, {25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574}};
    public static int anInt3241;
    public static Class68 aClass68_3243;
    public static RSString aClass1_3245 = RSString.CreateString("Sie haben gerade eine andere Welt verlassen)3");
    public static TypeFace aClass40_Sub5_Sub14_Sub1_3246;
    public static RSString aClass1_3247;
    public static int[] anIntArray3248;
    public static int[] anIntArray3250;
    public static int anInt3251;
    public static int anInt3252;
    public static int[] anIntArray3253;
    public static RSString aClass1_3254 = RSString.CreateString("redstone2");
    public static int[] anIntArray3255;

    static {
        aClass1_3247 = RSString.CreateString("Die Verbindung konnte");
    }

    public int anInt3230;
    public int anInt3231;
    public int anInt3233;
    public int anInt3235;
    public boolean aBoolean3237;
    public int anInt3239;
    public int anInt3240 = 0;
    public AnimationSequence aAnimationSequence_3242;
    public int anInt3244;
    public int anInt3249;

    public Class40_Sub5_Sub17_Sub6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        aBoolean3237 = false;
        anInt3233 = 0;
        anInt3235 = arg3;
        anInt3244 = arg2;
        anInt3230 = arg5 + arg6;
        anInt3231 = arg4;
        anInt3249 = arg0;
        anInt3239 = arg1;
        int i = SpotAnimDefinition.forId(anInt3249, 13).animationId;
        if(i != -1) {
            aBoolean3237 = false;
            aAnimationSequence_3242 = Class68_Sub1.method1050(i, 2);
        } else
            aBoolean3237 = true;

    }

    public static int method831(int arg0, int arg1, byte arg2) {

        anInt3252++;
        if(arg0 == -1)
            return 12345678;
        if(arg2 != 73)
            playerColours = null;
        arg1 = (0x7f & arg0) * arg1 / 128;
        if(arg1 < 2)
            arg1 = 2;
        else if(arg1 > 126)
            arg1 = 126;
        return arg1 + (arg0 & 0xff80);

    }

    public static RSString method832(RSString[] arg1) {

        anInt3251++;
        if(arg1.length < 2)
            throw new IllegalArgumentException();
        return IdentityKit.method627(120, arg1.length, 0, arg1);

    }

    public static void method833(int arg0, boolean arg1) {

        anInt3241++;
        if(((Player.localPlayer.anInt3098) >> 7 == VarbitDefinition.anInt2366) && ((Player.localPlayer.anInt3089) >> 7 == Class55.anInt1304))
            VarbitDefinition.anInt2366 = 0;
        int i = Class60.anInt1407;
        if(arg1)
            i = 1;
        int i_0_ = arg0;
        for(/**/; i > i_0_; i_0_++) {
            int i_1_;
            Player player;
            if(arg1) {
                i_1_ = 33538048;
                player = (Player.localPlayer);
            } else {
                i_1_ = Class57.anIntArray1334[i_0_] << 14;
                player = (Actor.aClass40_Sub5_Sub17_Sub4_Sub1Array3156[Class57.anIntArray1334[i_0_]]);
            }
            if(player != null && player.isVisible(1)) {
                player.aBoolean3287 = false;
                int i_2_ = player.anInt3098 >> 7;
                int i_3_ = player.anInt3089 >> 7;
                if(((VertexNormal.lowMemory && Class60.anInt1407 > 50) || Class60.anInt1407 > 200) && !arg1 && (player.anInt3077 == player.idleAnimation))
                    player.aBoolean3287 = true;
                if(i_2_ >= 0 && i_2_ < 104 && i_3_ >= 0 && i_3_ < 104) {
                    if((player.aClass40_Sub5_Sub17_Sub5_3265) != null && ((player.anInt3283 <= Node.pulseCycle)) && (Node.pulseCycle < player.anInt3274)) {
                        player.aBoolean3287 = false;
                        player.anInt3276 = (Class37.method430((byte) -117, Player.anInt3267, player.anInt3098, player.anInt3089));
                        Npc.aScene_3301.method112(Player.anInt3267, player.anInt3098, player.anInt3089, player.anInt3276, 60, player, player.anInt3118, i_1_, player.anInt3258, player.anInt3281, player.anInt3262, player.anInt3289);
                    } else {
                        if((0x7f & player.anInt3098) == 64 && (player.anInt3089 & 0x7f) == 64) {
                            if(Class40_Sub5_Sub11.anInt2628 == Class61.anIntArrayArray1435[i_2_][i_3_])
                                continue;
                            Class61.anIntArrayArray1435[i_2_][i_3_] = Class40_Sub5_Sub11.anInt2628;
                        }
                        player.anInt3276 = (Class37.method430((byte) -120, Player.anInt3267, player.anInt3098, player.anInt3089));
                        Npc.aScene_3301.method134(Player.anInt3267, player.anInt3098, player.anInt3089, player.anInt3276, 60, player, player.anInt3118, i_1_, player.aBoolean3105);
                    }
                }
            }
        }

    }

    public static void method835(byte arg0) {

        aClass1_3247 = null;
        aClass68_3243 = null;
        anIntArray3250 = null;
        playerColours = null;
        aClass40_Sub5_Sub14_Sub1_3246 = null;
        anIntArray3253 = null;
        aClass1_3245 = null;
        if(arg0 < 87)
            aClass40_Sub5_Sub14_Sub1_3236 = null;
        aClass1_3254 = null;
        anIntArray3248 = null;
        anIntArray3255 = null;
        aClass40_Sub5_Sub14_Sub1_3236 = null;

    }

    public Model getRotatedModel(int arg0) {

        anInt3234++;
        SpotAnimDefinition spotAnimDefinition = SpotAnimDefinition.forId(anInt3249, 13);
        int i = -110 / ((arg0 - 41) / 47);
        Model class40_sub5_sub17_sub5;
        if(aBoolean3237)
            class40_sub5_sub17_sub5 = spotAnimDefinition.method549(-1, 2);
        else
            class40_sub5_sub17_sub5 = spotAnimDefinition.method549(anInt3240, 2);
        if(class40_sub5_sub17_sub5 == null)
            return null;
        return class40_sub5_sub17_sub5;

    }

    public void method834(int arg0, int arg1) {

        anInt3232++;
        if(arg0 != 8076)
            method834(106, 6);
        if(!aBoolean3237) {
            anInt3233 += arg1;
            while((anInt3233 > aAnimationSequence_3242.animationLengths[anInt3240])) {
                anInt3233 -= aAnimationSequence_3242.animationLengths[anInt3240];
                anInt3240++;
                if(aAnimationSequence_3242.anIntArray2485.length <= anInt3240) {
                    aBoolean3237 = true;
                    break;
                }
            }
        }

    }
}
