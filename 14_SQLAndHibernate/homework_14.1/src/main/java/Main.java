import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/skillbox";
        String user = "root";
        String pass = "1234567890";

        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select name, \n" +
                    " round (count(month(subscription_date))/(timestampdiff(month, min(subscription_date), max(subscription_date)))-0.1, 3) as среднее_количество_продаж \n" +
                    "from courses \n" +
                    "join subscriptions on courses.id = subscriptions.course_id group by name;");
            while (resultSet.next()) {
                String course_name = resultSet.getString("name");
                double count = resultSet.getDouble("среднее_количество_продаж");

                System.out.println("Название курса: " + course_name + ". " + "Среднее количество продаж - " + count);
            }
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//   select name, count(month(subscription_date))/(timestampdiff(month, min(subscription_date), max(subscription_date))) as avg_month from courses join subscriptions on courses.id = subscriptions.course_id;