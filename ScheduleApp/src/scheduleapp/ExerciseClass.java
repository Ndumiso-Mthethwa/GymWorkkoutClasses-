/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scheduleapp;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.List;

/**
 *
 * @author tvnmt
 */
public class ExerciseClass {

    String type; //;
    Coach instructor;

    ArrayList<Exercise> workoutRoutine;
    ArrayList<Member> register;
    ArrayList<Member> attendance;
    public static ArrayList<String> Classes = new ArrayList<>(Arrays.asList(
        "Yoga", "Zumba", "Dance", "Spinning", "HIIT", "Bodyweight", 
        "cardio", "pilates", "CrossFit", "Calisthenics"));

    ExerciseClass(ArrayList<Exercise> routine) {
        this.workoutRoutine = routine;
    }

    ExerciseClass(int exerciseClassType, Coach classInstructor) {
        this.type = Classes.get(exerciseClassType);
        this.instructor = classInstructor;

        setRoutine(exerciseClassType);

    }

    public void scheduleClass() {

    }

    public ArrayList<Exercise> setRoutine(int category) {
        ArrayList<Exercise> exerciseForCategory = Exercise.getExercisesInCategory(category);
        ArrayList<Exercise> exerciseForClass = new ArrayList<Exercise>();
        {
            for (Exercise exercise : exerciseForCategory) {
                if (/*select exercise*/true) {
                    exerciseForClass.add(exercise);
                }
            }
        }
        return exerciseForClass;
    }

    public void enroleForClass(Member member) {
        // add member to register 
        if (register.contains(member)) {
             System.out.println("Member already registered for this class.");
        } else {
              register.add(member);
        }

    }

    public ArrayList<Member> markAttendance() {
        // mark attendance
        ArrayList<Member> present = new ArrayList<Member>();
        for (Member member : register) {

            if (/*member is present*/true) {
                present.add(member);
            }

        }

        return present;
    }
    
      /*
        method to perform the exercise 
        and measure how well it was executed
     */
    public double performExercise(Member member,Exercise exercise  ) { 
        
        double points;
        switch (exercise.metric) {
            case COUNT:
                points = CalculatePointsbyReps(exercise);
                break;
            case TIME:
                points = CalculatePointsbyDuration(exercise);
                break;
            case FORM:
                    points = CalculatePointsbyTechnique(exercise);
                break;
            default:
                points = 0; // no points if metric is not recognized
        }
       // = CalculatePointsbyReps( exercise);      
        
        member.rating +=  points; 
        
        return points;
    }
      public double CalculatePointsbyReps(Exercise exercise) {
        
        int totalRepsCompleted = 0,totalTimeDuration = 0; // capture input 
        double points;
        // formula to calculate points 
        
        points = totalRepsCompleted /(exercise.rep * exercise.set);
        /**/
        
        return points;
    }
      public double CalculatePointsbyDuration(Exercise exercise) {
        
         int totalDurationHeld = 0; // capture input 
        double points;
        points = 2* (totalDurationHeld /(exercise.duration));
        
        // points += totalRepsCompleted /(exercise.rep * exercise.set);
        
        
        return points;
    }
      public double CalculatePointsbyTechnique(Exercise exercise) {
        
        Double  techniqueSatisfactory = 0.0; // capture input 
        double points;
        // formula to calculate points 
        if (techniqueSatisfactory >= exercise.techniqueAccuracyThreshold) {
            points = techniqueSatisfactory * 2; // satisfactory percentage * 2 points for good technique
        } else {
            points = 1; // no points for poor technique
            
        }
        // points =+ totalRepsCompleted /(exercise.rep * exercise.set);
        // points =+ totalDurationHeld /(exercise.duration);

        /**/
        
        return points;
    }

}
