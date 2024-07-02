package interfaces;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Local;
import java.sql.SQLException;
import java.util.ArrayList;
import models.creatinglists.CategoriesList;
import models.creatinglists.DaysList;
import models.creatinglists.ExercisesNamesList;

/**
 * Třída sloužící pro manuální tvorbu tréninkových plánů a manipulaci s
 * vybranými cvičeními.
 */
@Local
public interface Creating {

    @PostConstruct
    public void init();

    public void createExercises(CategoriesList categoriesList) throws SQLException;

    /**
     * Metoda pro vytvoření plánu cvičení.
     */
    public void createPlan(DaysList daysList);

    public boolean isItTrainingDay(int nthDay);

    public int howManyCategoriesHaveNthDay(int nthDay);

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String[] getAllCategories();

    public String getCategoryName(int nthDay, int nthCategory);

    public String getForwardness();

    public int getAttendance();

    /**
     * @return musí být typu ArrayList<String[]> kvůli tomu, že xhtml neumí
     * pracovat s objektem třídy CategoriesList.
     */
    //spublic ArrayList<String[]> getCategories();
    public CategoriesList getCategories();
    
    /**
     * @param categories musí být typu ArrayList<String[]> kvůli tomu, že xhtml
     * neumí pracovat s objektem třídy CategoriesList.
     */
    public void setCategories(CategoriesList categories);

    public ExercisesNamesList getExercisesOfNthCategoryOfNthDay(int nthDay, int nthCategory);

    public ExercisesNamesList getSelectedExercisesOfNthCategoryOfNthDay(int nthDay, int nthCategory);

    /**
     * @return musí být typu ArrayList<ArrayList<String[]>> kvůli tomu, že xhtml
     * neumí pracovat s objektem třídy SelectedExercisesList.
     */
    public DaysList getSelectedExercises();

    /**
     * @param selectedExercises musí být typu ArrayList<ArrayList<String[]>>
     * kvůli tomu, že xhtml neumí pracovat s objektem třídy
     * SelectedExercisesList.
     */
    public void setSelectedExercises(DaysList selectedExercises);

    // </editor-fold>
}
