package com.gfs.backspaceinstring.benchmark;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;

import com.gfs.backspaceinstring.BackspacesInString;

public class BackspaceInStringBenchmarker {

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    public void benchmark_test() {

        // 231 character run
        String testString = "Lor#m ipsum dolor sit am#t, cons#ct#tur adipiscing #lit, s#d do #iusmod t#mpor incididunt ut labor# #t dolor#"
                + "magna aliqua. Ut #nim ad minim v#niam, quis nostrud #x#rcitation ullamco laboris nisi ut aliquip #x #a commodo cons#quat.";
        BackspacesInString target = new BackspacesInString();
        target.solution(testString);

        // 445 character run
        testString = "#or#m ipsum do#or sit am#t, cons#ct#tur adipiscing ##it, s#d do #iusmod t#mpor incididunt ut #abor# #t do#or# "
                + "magna a#iqua. Ut #nim ad minim v#niam, quis nostrud #x#rcitation u##amco #aboris nisi ut a#iquip #x #a commodo cons#quat. Duis "
                + "aut# irur# do#or in r#pr#h#nd#rit in vo#uptat# v##it #ss# ci##um do#or# #u fugiat nu##a pariatur. #xc#pt#ur sint occa#cat "
                + "cupidatat non proid#nt, sunt in cu#pa qui officia d#s#runt mo##it anim id #st #aborum.";
        target.solution(testString);

        // 3671 character run
        testString = "S#d ut p#rspiciatis und# omnis ist# natus #rror sit vo#uptat#m accusantium do#or#mqu# #audantium, totam r#m "
                + "ap#riam, #aqu# ipsa qua# ab i##o inv#ntor# v#ritatis #t quasi archit#cto b#ata# vita# dicta sunt #xp#icabo. N#mo #nim ipsam "
                + "vo#uptat#m quia vo#uptas sit asp#rnatur aut odit aut fu#it, s#d quia cons#quuntur ma#ni do#or#s #os qui ration# vo#uptat#m s#qui"
                + " n#sciunt. N#qu# porro quisquam #st, qui do#or#m ipsum quia do#or sit am#t, cons#ct#tur, adipisci v##it, s#d quia non numquam "
                + "#ius modi t#mpora incidunt ut #abor# #t do#or# ma#nam a#iquam qua#rat vo#uptat#m. Ut #nim ad minima v#niam, quis nostrum "
                + "#x#rcitation#m u##am corporis suscipit #aboriosam, nisi ut a#iquid #x #a commodi cons#quatur? Quis aut#m v## #um iur# "
                + "r#pr#h#nd#rit qui in #a vo#uptat# v##it #ss# quam nihi# mo##stia# cons#quatur, v## i##um qui do#or#m #um fu#iat quo vo#uptas "
                + "nu##a pariatur?"
                + "But I must #xp#ain to you how a## this mistak#n id#a of d#nouncin# p##asur# and praisin# pain was born and I wi## #iv# you a "
                + "comp##t# account of th# syst#m, and #xpound th# actua# t#achin#s of th# #r#at #xp#or#r of th# truth, th# mast#r-bui#d#r of human"
                + " happin#ss. No on# r#j#cts, dis#ik#s, or avoids p##asur# its##f, b#caus# it is p##asur#, but b#caus# thos# who do not know how "
                + "to pursu# p##asur# rationa##y #ncount#r cons#qu#nc#s that ar# #xtr#m##y painfu#. Nor a#ain is th#r# anyon# who #ov#s or pursu#s "
                + "or d#sir#s to obtain pain of its##f, b#caus# it is pain, but b#caus# occasiona##y circumstanc#s occur in which toi# and pain can"
                + " procur# him som# #r#at p##asur#. To tak# a trivia# #xamp##, which of us #v#r und#rtak#s #aborious physica# #x#rcis#, #xc#pt to "
                + "obtain som# advanta## from it? But who has any ri#ht to find fau#t with a man who choos#s to #njoy a p##asur# that has no "
                + "annoyin# cons#qu#nc#s, or on# who avoids a pain that produc#s no r#su#tant p##asur#?"
                + "At v#ro #os #t accusamus #t iusto odio di#nissimos ducimus qui b#anditiis pra#s#ntium vo#uptatum d###niti atqu# corrupti quos "
                + "do#or#s #t quas mo##stias #xc#pturi sint occa#cati cupiditat# non provid#nt, simi#iqu# sunt in cu#pa qui officia d#s#runt "
                + "mo##itia animi, id #st #aborum #t do#orum fu#a. #t harum quid#m r#rum faci#is #st #t #xp#dita distinctio. Nam #ib#ro t#mpor#, "
                + "cum so#uta nobis #st ##i##ndi optio cumqu# nihi# imp#dit quo minus id quod maxim# p#ac#at fac#r# possimus, omnis vo#uptas "
                + "assum#nda #st, omnis do#or r#p####ndus. T#mporibus aut#m quibusdam #t aut officiis d#bitis aut r#rum n#c#ssitatibus sa#p# "
                + "#v#ni#t ut #t vo#uptat#s r#pudianda# sint #t mo##stia# non r#cusanda#. Itaqu# #arum r#rum hic t#n#tur a sapi#nt# d###ctus, ut "
                + "aut r#ici#ndis vo#uptatibus maior#s a#ias cons#quatur aut p#rf#r#ndis do#oribus asp#rior#s r#p###at."
                + "On th# oth#r hand, w# d#nounc# with ri#ht#ous indi#nation and dis#ik# m#n who ar# so b##ui##d and d#mora#iz#d by th# charms of "
                + "p##asur# of th# mom#nt, so b#ind#d by d#sir#, that th#y cannot for#s## th# pain and troub## that ar# bound to #nsu#; and #qua# "
                + "b#am# b##on#s to thos# who fai# in th#ir duty throu#h w#akn#ss of wi##, which is th# sam# as sayin# throu#h shrinkin# from toi# "
                + "and pain. Th#s# cas#s ar# p#rf#ct#y simp## and #asy to distin#uish. In a fr## hour, wh#n our pow#r of choic# is untramm####d and"
                + " wh#n nothin# pr#v#nts our b#in# ab## to do what w# #ik# b#st, #v#ry p##asur# is to b# w##com#d and #v#ry pain avoid#d. But in "
                + "c#rtain circumstanc#s and owin# to th# c#aims of duty or th# ob#i#ations of busin#ss it wi## fr#qu#nt#y occur that p##asur#s "
                + "hav# to b# r#pudiat#d and annoyanc#s acc#pt#d. Th# wis# man th#r#for# a#ways ho#ds in th#s# matt#rs to this princip## of "
                + "s###ction: h# r#j#cts p##asur#s to s#cur# oth#r #r#at#r p##asur#s, or ##s# h# #ndur#s pains to avoid wors# pains.";
        target.solution(testString);

    }

    //    private void logMemmory() {
    //                memmoryUse.add((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024);
    //    }

}
