package com.jagex.runescape;

import com.jagex.runescape.cache.Cache;
import com.jagex.runescape.cache.CacheIndex;
import com.jagex.runescape.cache.def.ActorDefinition;
import com.jagex.runescape.cache.def.OverlayDefinition;
import com.jagex.runescape.cache.def.UnderlayDefinition;
import com.jagex.runescape.cache.def.IdentityKit;
import com.jagex.runescape.cache.media.AnimationSequence;
import com.jagex.runescape.cache.media.ImageRGB;
import com.jagex.runescape.cache.media.SpotAnimDefinition;
import com.jagex.runescape.cache.media.Widget;
import com.jagex.runescape.collection.Node;
import com.jagex.runescape.io.Buffer;
import com.jagex.runescape.media.Rasterizer3D;
import com.jagex.runescape.media.VertexNormal;
import com.jagex.runescape.media.renderable.GameObject;
import com.jagex.runescape.media.renderable.Renderable;
import com.jagex.runescape.media.renderable.actor.Actor;
import com.jagex.runescape.media.renderable.actor.Npc;
import com.jagex.runescape.scene.Scene;
import com.jagex.runescape.scene.tile.FloorDecoration;
import com.jagex.runescape.scene.tile.WallDecoration;
import com.jagex.runescape.scene.util.CollisionMap;

public class Class40_Sub3 extends Node {
    public static RSString cmd_fpson = RSString.CreateString("::fpson");
    public static int[] anIntArray2016 = new int[32768];
    public static ImageRGB[] aClass40_Sub5_Sub14_Sub4Array2019;
    public static int anInt2020;
    public static int anInt2021 = 0;
    public static int anInt2022;
    public static int[] soundDelay = new int[50];
    public static int anInt2024 = 1;
    public static boolean aBoolean2026 = false;
    public static int anInt2029;
    public static int anInt2032 = 0;
    public static int anInt2034;
    public static CacheIndex aCacheIndex_2037;
    public int anInt2017;
    public int anInt2018;
    public int anInt2025;
    public int anInt2027;
    public int anInt2028;
    public int anInt2030;
    public int anInt2031 = -1;
    public int anInt2033 = 0;
    public int anInt2035;
    public int anInt2036;
    public int anInt2038;
    public int anInt2039;

    public static void method529(int arg0) {

        if(arg0 != -10)
            cmd_fpson = null;
        soundDelay = null;
        aCacheIndex_2037 = null;
        anIntArray2016 = null;
        cmd_fpson = null;
        aClass40_Sub5_Sub14_Sub4Array2019 = null;

    }

    public static void method530(int arg0) {
        anInt2029++;
        if(Class40_Sub5_Sub6.anInt2451 == 0) {
            Npc.aScene_3301 = new Scene(4, 104, 104, Class40_Sub6.tile_height);
            for(int i = 0; i < 4; i++)
                Landscape.aCollisionMapArray1167[i] = new CollisionMap(104, 104);
            Class40_Sub5_Sub13.aClass40_Sub5_Sub14_Sub4_2765 = new ImageRGB(512, 512);
            Class67.anInt1607 = 5;
            Class40_Sub5_Sub6.anInt2451 = 20;
            Class22_Sub2.currentLoadingText = Widget.aClass1_2674;
        } else if(Class40_Sub5_Sub6.anInt2451 == 20) {
            int[] is = new int[9];
            for(int i = 0; i < 9; i++) {
                int i_0_ = 15 + (32 * i + 128);
                int i_1_ = 3 * i_0_ + 600;
                int i_2_ = Rasterizer3D.sinetable[i_0_];
                is[i] = i_2_ * i_1_ >> 16;
            }
            Scene.method95(is, 500, 800, 512, 334);
            Class67.anInt1607 = 10;
            Class22_Sub2.currentLoadingText = RSCanvas.aClass1_63;
            Class40_Sub5_Sub6.anInt2451 = 30;
        } else if(Class40_Sub5_Sub6.anInt2451 == 30) {
            FloorDecoration.aClass6_Sub1_605 = KeyFocusListener.method957(0, true, false, (byte) 127, true);
            Class40_Sub5_Sub17_Sub1.aClass6_Sub1_3000 = KeyFocusListener.method957(1, true, false, (byte) 125, true);
            IdentityKit.aClass6_Sub1_2609 = KeyFocusListener.method957(2, true, true, (byte) 119, false);
            Class65.aClass6_Sub1_1533 = KeyFocusListener.method957(3, true, false, (byte) 119, true);
            Actor.aClass6_Sub1_3157 = KeyFocusListener.method957(4, true, false, (byte) 119, true);
            Renderable.aClass6_Sub1_2857 = KeyFocusListener.method957(5, true, true, (byte) 123, true);
            Class55.aClass6_Sub1_1286 = KeyFocusListener.method957(6, false, true, (byte) 117, true);
            UnderlayDefinition.aClass6_Sub1_2571 = KeyFocusListener.method957(7, true, false, (byte) 124, true);
            ActorDefinition.aClass6_Sub1_2377 = KeyFocusListener.method957(8, true, false, (byte) 127, true);
            Class32.aClass6_Sub1_773 = KeyFocusListener.method957(9, true, false, (byte) 127, true);
            RSCanvas.aClass6_Sub1_48 = KeyFocusListener.method957(10, true, false, (byte) 125, true);
            VertexNormal.aClass6_Sub1_1104 = KeyFocusListener.method957(11, true, false, (byte) 120, true);
            Class56.aClass6_Sub1_1323 = KeyFocusListener.method957(12, true, false, (byte) 118, true);
            Class40_Sub5_Sub6.anInt2451 = 40;
            Class22_Sub2.currentLoadingText = FloorDecoration.STRING_CONNECTING_UPDATE_SERVER;
            Class67.anInt1607 = 20;
        } else if(Class40_Sub5_Sub6.anInt2451 == 40) {
            int i = 0;
            i += FloorDecoration.aClass6_Sub1_605.method197(100) * 5 / 100;
            i += (5 * Class40_Sub5_Sub17_Sub1.aClass6_Sub1_3000.method197(100) / 100);
            i += 5 * IdentityKit.aClass6_Sub1_2609.method197(100) / 100;
            i += 5 * Class65.aClass6_Sub1_1533.method197(100) / 100;
            i += (5 * Actor.aClass6_Sub1_3157.method197(100) / 100);
            i += (5 * Renderable.aClass6_Sub1_2857.method197(arg0) / 100);
            i += Class55.aClass6_Sub1_1286.method197(100) * 5 / 100;
            i += 40 * UnderlayDefinition.aClass6_Sub1_2571.method197(100) / 100;
            i += ActorDefinition.aClass6_Sub1_2377.method197(100) * 5 / 100;
            i += Class32.aClass6_Sub1_773.method197(arg0) * 5 / 100;
            i += 5 * RSCanvas.aClass6_Sub1_48.method197(100) / 100;
            i += 5 * VertexNormal.aClass6_Sub1_1104.method197(100) / 100;
            i += 5 * Class56.aClass6_Sub1_1323.method197(100) / 100;
            if(i == 100) {
                Class40_Sub5_Sub6.anInt2451 = 45;
                Class22_Sub2.currentLoadingText = Class40_Sub7.aClass1_2125;
                Class67.anInt1607 = 30;
            } else {
                if(i != 0)
                    Class22_Sub2.currentLoadingText = (Class40_Sub5_Sub17_Sub6.method832(new RSString[]{ActorDefinition.aClass1_2396, HashTable.method334(i, -1), Class44.aClass1_1041}));
                Class67.anInt1607 = 30;
            }
        } else if(Class40_Sub5_Sub6.anInt2451 == 45) {
            Class38_Sub1.method446(ISAAC.aClass31_521, 0, !VertexNormal.lowMemory, (byte) 30);
            Class49.aClass40_Sub9_Sub1_1152 = GameFrame.method1003(ISAAC.aClass31_521, GameFrame.aCanvas1469, arg0 ^ 0x74be);
            Class55.aClass48_1289 = new Class48(22050, CollisionMap.anInt141);
            Class40_Sub5_Sub6.anInt2451 = 50;
            Class22_Sub2.currentLoadingText = VertexNormal.aClass1_1105;
            Class67.anInt1607 = 35;
        } else if(Class40_Sub5_Sub6.anInt2451 == 50) {
            int i = 0;
            if(Class40_Sub5_Sub17_Sub6.aClass40_Sub5_Sub14_Sub1_3236 != null)
                i++;
            else
                Class40_Sub5_Sub17_Sub6.aClass40_Sub5_Sub14_Sub1_3236 = FloorDecoration.method347(ActorDefinition.aClass6_Sub1_2377, arg0 + 155, HuffmanEncoding.blank_string, Class40_Sub6.aClass1_2101);
            if(WallDecoration.fontNormal != null)
                i++;
            else
                WallDecoration.fontNormal = FloorDecoration.method347(ActorDefinition.aClass6_Sub1_2377, 255, HuffmanEncoding.blank_string, Class67.aClass1_1580);
            if(Class40_Sub5_Sub17_Sub6.aClass40_Sub5_Sub14_Sub1_3246 != null)
                i++;
            else
                Class40_Sub5_Sub17_Sub6.aClass40_Sub5_Sub14_Sub1_3246 = FloorDecoration.method347(ActorDefinition.aClass6_Sub1_2377, 255, HuffmanEncoding.blank_string, Class38_Sub1.aClass1_1921);
            if(i < 3) {
                Class22_Sub2.currentLoadingText = (Class40_Sub5_Sub17_Sub6.method832(new RSString[]{VertexNormal.aClass1_1099, HashTable.method334(i * 100 / 3, -1), Class44.aClass1_1041}));
                Class67.anInt1607 = 40;
            } else {
                Class40_Sub5_Sub6.anInt2451 = 60;
                Class67.anInt1607 = 40;
                Class22_Sub2.currentLoadingText = ActorDefinition.aClass1_2392;
            }
        } else if(Class40_Sub5_Sub6.anInt2451 == 60) {
            int i = Class60.method988(RSCanvas.aClass6_Sub1_48, ActorDefinition.aClass6_Sub1_2377, arg0 ^ ~0x14);
            int i_3_ = ISAAC.method288((byte) 119);
            if(i < i_3_) {
                Class22_Sub2.currentLoadingText = (Class40_Sub5_Sub17_Sub6.method832(new RSString[]{Class48.aClass1_1124, HashTable.method334(100 * i / i_3_, -1), Class44.aClass1_1041}));
                Class67.anInt1607 = 50;
            } else {
                Class22_Sub2.currentLoadingText = Class68.aClass1_1638;
                Class67.anInt1607 = 50;
                OverlayDefinition.method559(5, 80);
                Class40_Sub5_Sub6.anInt2451 = 70;
            }
        } else if(Class40_Sub5_Sub6.anInt2451 == 70) {
            if(IdentityKit.aClass6_Sub1_2609.method185((byte) 98)) {
                Class38.method441(IdentityKit.aClass6_Sub1_2609, -76);
                UnderlayDefinition.method616((IdentityKit.aClass6_Sub1_2609), (byte) 85);
                method977(3, IdentityKit.aClass6_Sub1_2609, UnderlayDefinition.aClass6_Sub1_2571);
                method980(28987, UnderlayDefinition.aClass6_Sub1_2571, VertexNormal.lowMemory, IdentityKit.aClass6_Sub1_2609);
                Class27.method357(UnderlayDefinition.aClass6_Sub1_2571, arg0 ^ ~0x2a85, IdentityKit.aClass6_Sub1_2609);
                Class42.method885(IdentityKit.aClass6_Sub1_2609, Class22.aBoolean541, UnderlayDefinition.aClass6_Sub1_2571, -313);
                Cache.method236(false, Class40_Sub5_Sub17_Sub1.aClass6_Sub1_3000, IdentityKit.aClass6_Sub1_2609, FloorDecoration.aClass6_Sub1_605);
                Class55.method966(arg0 ^ 0x38, UnderlayDefinition.aClass6_Sub1_2571, IdentityKit.aClass6_Sub1_2609);
                Landscape.method936(-17552, IdentityKit.aClass6_Sub1_2609);
                Main.method43(IdentityKit.aClass6_Sub1_2609, true);
                Class40_Sub5_Sub17_Sub1.method758(Class65.aClass6_Sub1_1533, (ActorDefinition.aClass6_Sub1_2377), (UnderlayDefinition.aClass6_Sub1_2571), (byte) 90);
                Class40_Sub5_Sub6.anInt2451 = 80;
                Class67.anInt1607 = 60;
                Class22_Sub2.currentLoadingText = Class42.aClass1_1000;
            } else {
                Class22_Sub2.currentLoadingText = (Class40_Sub5_Sub17_Sub6.method832(new RSString[]{Class33.aClass1_783, HashTable.method334(IdentityKit.aClass6_Sub1_2609.method202(false), -1), Class44.aClass1_1041}));
                Class67.anInt1607 = 60;
            }
        } else if(Class40_Sub5_Sub6.anInt2451 == 80) {
            int i = 0;
            if(AnimationSequence.aClass40_Sub5_Sub14_Sub4_2482 != null)
                i++;
            else
                AnimationSequence.aClass40_Sub5_Sub14_Sub4_2482 = HuffmanEncoding.method1028(ActorDefinition.aClass6_Sub1_2377, KeyFocusListener.aClass1_1284, (byte) 21, HuffmanEncoding.blank_string);
            if(SpotAnimDefinition.minimapEdge == null)
                SpotAnimDefinition.minimapEdge = HuffmanEncoding.method1028(ActorDefinition.aClass6_Sub1_2377, Class61.aClass1_1427, (byte) 21, HuffmanEncoding.blank_string);
            else
                i++;
            if(SpotAnimDefinition.aClass40_Sub5_Sub14_Sub2Array2301 != null)
                i++;
            else
                SpotAnimDefinition.aClass40_Sub5_Sub14_Sub2Array2301 = SpotAnimDefinition.method550((ActorDefinition.aClass6_Sub1_2377), (byte) -66, Class29.aClass1_671, HuffmanEncoding.blank_string);
            if(Class8.aClass40_Sub5_Sub14_Sub4Array296 == null)
                Class8.aClass40_Sub5_Sub14_Sub4Array296 = Class40_Sub2.method526((ActorDefinition.aClass6_Sub1_2377), 0, (GameObject.aClass1_3047), HuffmanEncoding.blank_string);
            else
                i++;
            if(AnimationSequence.aClass40_Sub5_Sub14_Sub4Array2474 != null)
                i++;
            else
                AnimationSequence.aClass40_Sub5_Sub14_Sub4Array2474 = Class40_Sub2.method526((ActorDefinition.aClass6_Sub1_2377), 0, Class40_Sub6.aClass1_2114, HuffmanEncoding.blank_string);
            if(FloorDecoration.aClass40_Sub5_Sub14_Sub4Array603 == null)
                FloorDecoration.aClass40_Sub5_Sub14_Sub4Array603 = Class40_Sub2.method526((ActorDefinition.aClass6_Sub1_2377), 0, Class40_Sub11.aClass1_2161, HuffmanEncoding.blank_string);
            else
                i++;
            if(Class68_Sub1.aClass40_Sub5_Sub14_Sub4Array2204 != null)
                i++;
            else
                Class68_Sub1.aClass40_Sub5_Sub14_Sub4Array2204 = Class40_Sub2.method526((ActorDefinition.aClass6_Sub1_2377), 0, Class22_Sub1.aClass1_1861, HuffmanEncoding.blank_string);
            if(UnderlayDefinition.aClass40_Sub5_Sub14_Sub4Array2567 == null)
                UnderlayDefinition.aClass40_Sub5_Sub14_Sub4Array2567 = Class40_Sub2.method526((ActorDefinition.aClass6_Sub1_2377), 0, Class52.aClass1_1230, HuffmanEncoding.blank_string);
            else
                i++;
            if(Class45.aClass40_Sub5_Sub14_Sub4_1057 == null)
                Class45.aClass40_Sub5_Sub14_Sub4_1057 = HuffmanEncoding.method1028(ActorDefinition.aClass6_Sub1_2377, Class40_Sub6.aClass1_2109, (byte) 21, HuffmanEncoding.blank_string);
            else
                i++;
            if(aClass40_Sub5_Sub14_Sub4Array2019 == null)
                aClass40_Sub5_Sub14_Sub4Array2019 = Class40_Sub2.method526((ActorDefinition.aClass6_Sub1_2377), 0, Class5.aClass1_203, HuffmanEncoding.blank_string);
            else
                i++;
            if(Class37.aClass40_Sub5_Sub14_Sub4Array878 != null)
                i++;
            else
                Class37.aClass40_Sub5_Sub14_Sub4Array878 = Class40_Sub2.method526((ActorDefinition.aClass6_Sub1_2377), 0, Class40_Sub13.aClass1_2179, HuffmanEncoding.blank_string);
            if(Class27.aClass40_Sub5_Sub14_Sub4Array649 == null)
                Class27.aClass40_Sub5_Sub14_Sub4Array649 = Class40_Sub2.method526((ActorDefinition.aClass6_Sub1_2377), 0, Class4.aClass1_183, HuffmanEncoding.blank_string);
            else
                i++;
            if(CacheIndex.aClass40_Sub5_Sub14_Sub2Array215 == null)
                CacheIndex.aClass40_Sub5_Sub14_Sub2Array215 = SpotAnimDefinition.method550((ActorDefinition.aClass6_Sub1_2377), (byte) -125, RSString.aClass1_1677, HuffmanEncoding.blank_string);
            else
                i++;
            if(Class40_Sub5_Sub13.moderatorIcon != null)
                i++;
            else
                Class40_Sub5_Sub13.moderatorIcon = SpotAnimDefinition.method550((ActorDefinition.aClass6_Sub1_2377), (byte) -55, Class38.aClass1_881, HuffmanEncoding.blank_string);
            if(i < 14) {
                Class22_Sub2.currentLoadingText = (Class40_Sub5_Sub17_Sub6.method832(new RSString[]{Class17.aClass1_452, HashTable.method334(100 * i / 14, -1), Class44.aClass1_1041}));
                Class67.anInt1607 = 70;
            } else {
                SpotAnimDefinition.minimapEdge.trim();
                int i_4_ = (int) (Math.random() * 21.0) - 10;
                int i_5_ = (int) (21.0 * Math.random()) - 10;
                int i_6_ = (int) (41.0 * Math.random()) - 20;
                int i_7_ = -10 + (int) (21.0 * Math.random());
                for(int i_8_ = 0; Class8.aClass40_Sub5_Sub14_Sub4Array296.length > i_8_; i_8_++)
                    Class8.aClass40_Sub5_Sub14_Sub4Array296[i_8_].method717(i_6_ + i_4_, i_5_ + i_6_, i_7_ + i_6_);
                SpotAnimDefinition.aClass40_Sub5_Sub14_Sub2Array2301[0].mixPalette(i_4_ + i_6_, i_5_ + i_6_, i_6_ + i_7_);
                Class22_Sub2.currentLoadingText = Class38_Sub1.aClass1_1922;
                Class67.anInt1607 = 70;
                Class40_Sub5_Sub6.anInt2451 = 85;
            }
        } else if(Class40_Sub5_Sub6.anInt2451 == 85) {
            int i = KeyFocusListener.method955(ActorDefinition.aClass6_Sub1_2377, (byte) -59);
            int i_9_ = ActorDefinition.method576(false);
            if(i < i_9_) {
                Class22_Sub2.currentLoadingText = (Class40_Sub5_Sub17_Sub6.method832(new RSString[]{Class27.aClass1_668, HashTable.method334(i * 100 / i_9_, -1), Class44.aClass1_1041}));
                Class67.anInt1607 = 80;
            } else {
                Class22_Sub2.currentLoadingText = GameObject.aClass1_3038;
                Class40_Sub5_Sub6.anInt2451 = 90;
                Class67.anInt1607 = 80;
            }
        } else if(Class40_Sub5_Sub6.anInt2451 == 90) {
            if(Class32.aClass6_Sub1_773.method185((byte) 62)) {
                Class35 class35 = new Class35(Class32.aClass6_Sub1_773, ActorDefinition.aClass6_Sub1_2377, 20, 0.8, !VertexNormal.lowMemory ? 128 : 64);
                Rasterizer3D.method703(class35);
                Rasterizer3D.method711(0.8);
                Class40_Sub5_Sub6.anInt2451 = 110;
                Class67.anInt1607 = 90;
                Class22_Sub2.currentLoadingText = Actor.aClass1_3124;
            } else {
                Class22_Sub2.currentLoadingText = (Class40_Sub5_Sub17_Sub6.method832(new RSString[]{SpotAnimDefinition.aClass1_2294, HashTable.method334(Class32.aClass6_Sub1_773.method202(false), -1), Class44.aClass1_1041}));
                Class67.anInt1607 = 90;
            }
        } else if(Class40_Sub5_Sub6.anInt2451 == 110) {
            Class12.mouseCapturer = new Class39();
            ISAAC.aClass31_521.method394(10, 0, Class12.mouseCapturer);
            Class22_Sub2.currentLoadingText = SpotAnimDefinition.aClass1_2297;
            Class40_Sub5_Sub6.anInt2451 = 120;
            Class67.anInt1607 = 94;
        } else if(Class40_Sub5_Sub6.anInt2451 == 120) {
            if(RSCanvas.aClass6_Sub1_48.method194(FloorDecoration.aClass1_615, HuffmanEncoding.blank_string, -1234)) {
                HuffmanEncoding huffmanEncoding = new HuffmanEncoding(RSCanvas.aClass6_Sub1_48.method170(HuffmanEncoding.blank_string, FloorDecoration.aClass1_615, arg0 + -99));
                Class40_Sub5_Sub17_Sub3.method778(true, huffmanEncoding);
                Class40_Sub5_Sub6.anInt2451 = 130;
                Class22_Sub2.currentLoadingText = Landscape.aClass1_1173;
                Class67.anInt1607 = 96;
            } else {
                Class22_Sub2.currentLoadingText = (Class40_Sub5_Sub17_Sub6.method832(new RSString[]{Class40_Sub5_Sub17_Sub1.aClass1_3014, Class57.aClass1_1348}));
                Class67.anInt1607 = 96;
            }
        } else if(Class40_Sub5_Sub6.anInt2451 == 130) {
            if(!Class65.aClass6_Sub1_1533.method185((byte) 66)) {
                Class22_Sub2.currentLoadingText = (Class40_Sub5_Sub17_Sub6.method832((new RSString[]{Class40_Sub7.aClass1_2132, HashTable.method334(4 * Class65.aClass6_Sub1_1533.method202(false) / 5, arg0 ^ ~0x64), Class44.aClass1_1041})));
                Class67.anInt1607 = 100;
            } else if(Class56.aClass6_Sub1_1323.method185((byte) 69)) {
                Class22_Sub2.currentLoadingText = Class22_Sub1.aClass1_1858;
                Class40_Sub5_Sub6.anInt2451 = 140;
                Class67.anInt1607 = 100;
            } else {
                Class22_Sub2.currentLoadingText = (Class40_Sub5_Sub17_Sub6.method832((new RSString[]{Class40_Sub7.aClass1_2132, HashTable.method334(80 + Class56.aClass6_Sub1_1323.method202(false) / 5, -1), Class44.aClass1_1041})));
                Class67.anInt1607 = 100;
            }
        } else {
            if(arg0 != 100)
                aClass40_Sub5_Sub14_Sub4Array2019 = null;
            if(Class40_Sub5_Sub6.anInt2451 == 140)
                OverlayDefinition.method559(10, arg0 ^ 0x27);
        }
    }

    public static UnderlayDefinition method531(byte arg0, int arg1) {

        UnderlayDefinition underlayDefinition = ((UnderlayDefinition) WallDecoration.aClass9_1247.get((long) arg1, (byte) 43));
        anInt2022++;
        if(underlayDefinition != null)
            return underlayDefinition;
        byte[] is = Actor.aCacheIndex_3150.getFile(arg1, 1);
        underlayDefinition = new UnderlayDefinition();
        if(is != null)
            underlayDefinition.readValues(new Buffer(is));
        underlayDefinition.calculateHsl();
        if(arg0 >= -39)
            cmd_fpson = null;
        WallDecoration.aClass9_1247.put(-7208, (long) arg1, underlayDefinition);
        return underlayDefinition;

    }

    public static void method977(int arg0, CacheIndex arg1, CacheIndex arg2) {

        Class27.aCacheIndex_654 = arg2;
        if(arg0 == 3) {
            Class49.aCacheIndex_1150 = arg1;
            PacketBuffer.anInt2257 = Class49.aCacheIndex_1150.method190(3, (byte) 8);
        }

    }

    public static void method980(int arg0, CacheIndex arg1, boolean arg2, CacheIndex arg3) {

        aCacheIndex_2037 = arg3;
        Class35.aBoolean1734 = arg2;
        if(arg0 == 28987)
            RSString.aCacheIndex_1705 = arg1;

    }
}
