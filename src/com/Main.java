/** Animal деген класс тузунуз жана бир метод кошунуз. Анын 3 наследнигин тузунуз.
 Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
 Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин кошунуз.
 instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун чыгарыныз.
 Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды болуп оз озунун массивине салыныз */

package com;

import com.Polymorphism.Animal;
import com.Polymorphism.Eagle;
import com.Polymorphism.Shark;
import com.Polymorphism.Turtle;

public class Main {
    public static void main(String[] args) {

        Animal [] animals = {new Turtle(), new Eagle(), new Shark()};
//        for (Animal a: animals) {
//            a.animalAction();}


        Animal [] animals1 = {new Turtle(), new Eagle(), new Shark()};
        for (Animal b: animals1) {
        if (b instanceof Turtle){
        b.animalAction();}}
//
//        Animal [] animals2 = {new Turtle(), new Eagle(), new Shark()};
//        for (Animal c: animals2) {
//            if (c instanceof Eagle){
//                c.animalAction();}}
//
//        Animal [] animals3 = {new Turtle(), new Eagle(), new Shark()};
//        for (Animal d: animals3) {
////            if (d instanceof Shark)
//                d.animalAction();}


        for (Animal a: animals){
            if (a.getClass().getName().equals("com.Polymorphism.Turtle")){
                a.animalAction();}}

//        for (Animal a: animals) {
//            if (a.getClass().getName().equals("com.Polymorphism.Shark")){
//                a.animalAction();}}
//
//        for (Animal a : animals) {
//            if (a.getClass().getName().equals("com.Polymorphism.Eagle")){
//                a.animalAction();}}



}}