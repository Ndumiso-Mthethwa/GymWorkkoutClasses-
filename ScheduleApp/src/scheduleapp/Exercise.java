/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scheduleapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tvnmt
 */
public class Exercise {

    String name;
    int ClassCategory; // int in this class but a string in ExercisesClass class 
    Intencity difficulty;
    int set;
    Measurment  metric; // this is not used in the current implementation, but can be used for future enhancements
    int rep;
    int duration; /* date time instead of int*/ 
    double techniqueAccuracyThreshold ;
    
    static enum Intencity {EASY,MODERATE,HARD}
    static enum Measurment {COUNT,TIME,FORM}
    
    public static ArrayList<Exercise> ExerciseList;

    public static ArrayList<Exercise> getExercisesInCategory(int category) {
        ArrayList<Exercise> ExerciseInCategory = new ArrayList<Exercise>();
        for (Exercise exercise : ExerciseList) {
            if (exercise.ClassCategory == category) {
                ExerciseInCategory.add(exercise);
            }

        }
        return ExerciseInCategory;
    }

    public Exercise(String name, int set, int rep, int duration) {
        this.name = name;
        this.ClassCategory = 1;
        this.difficulty = Intencity.EASY;
        this.set = set;
        this.rep = rep;
        this.duration = duration;
    }

    public static void populateWorouts() {
        ExerciseList = new ArrayList<Exercise>(List.of(
                new Exercise("Sun Salutation", 1, 10, 15),
                new Exercise("Tree Pose", 1, 1, 5),
                new Exercise("Downward Dog", 2, 1, 10)
        ));

    }

    public Exercise(String name, int ClassCategory, Intencity level,  Measurment  unit, int set, int rep, int duration) {
        this.name = name;
        this.ClassCategory = ClassCategory;
        this.difficulty = level;
        this.metric = unit;
        this.set = set;
        this.rep = rep;
        this.duration = duration;
    }

  

}
