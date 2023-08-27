
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuário
 */
public class Grades {

    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;

    public Grades() {

        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
    }

    public void addGrade(int grade) {

        if (grade >= 0 && grade <= 100) {

            this.points.add(grade);

            if (grade >= 50) {

                this.passingPoints.add(grade);
            }
        }
    }

    public double getAverageAll() {

        int sum = 0;

        for (int i : this.points) {

            sum += i;
        }

        double average = (double) sum / this.points.size();

        return average;
    }

    public double getAveragePassing() {

        int sum = 0;

        for (int i : this.passingPoints) {

            sum += i;
        }

        double average = (double) sum / this.passingPoints.size();

        return average;
    }

    public double getPassPercentage() {

        return 100 * (double) this.passingPoints.size() / this.points.size();
    }

    public boolean checkPassingPoints() {

        return this.passingPoints.isEmpty();
    }

    public void gradeDistribution() {

        int[] counters = new int[6];

        for (int p : this.points) {

            if (p < 50) {

                counters[0] += 1;
            } else if (p < 60) {

                counters[1] += 1;
            } else if (p < 70) {

                counters[2] += 1;
            } else if (p < 80) {

                counters[3] += 1;
            } else if (p < 90) {

                counters[4] += 1;
            } else {

                counters[5] += 1;
            }
        }

        for (int i = counters.length - 1; i >= 0; i--) {

            System.out.print(i + ":");
            printStars(counters[i]);
        }
    }

    public void printStars(int v) {

        for (int i = 0; i < v; i++) {

            System.out.print("*");
        }

        System.out.println("");
    }
}
