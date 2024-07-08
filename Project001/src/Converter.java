import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Converter {
    public static void main (String[] args) throws Exception {

        System.out.println("Введите строку(рус.) для перекодировки в UNICODE\nдля PLM Teamcenter");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


       /* File file = new File("output.txt");
        FileWriter fileReader = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileReader);
        bufferedWriter.write("\\u0410");
        bufferedWriter.write("\\u0411");
        bufferedWriter.close();

         bufferedWriter.write("\\u0410");*/

        String uniString = reader.readLine();
        char[] symbols = uniString.toCharArray();
        System.out.println("# Строка в юникоде: "+ uniString );

        for (char symbol : symbols)
            switch (symbol) {
                case 'А' -> System.out.print("\\u0410");
                case 'Б' -> System.out.print("\\u0411");
                case 'В' -> System.out.print("\\u0412");
                case 'Г' -> System.out.print("\\u0413");
                case 'Д' -> System.out.print("\\u0414");
                case 'Е' -> System.out.print("\\u0415");
                case 'Ё' -> System.out.print("\\u0401");
                case 'Ж' -> System.out.print("\\u0416");
                case 'З' -> System.out.print("\\u0417");
                case 'И' -> System.out.print("\\u0418");
                case 'Й' -> System.out.print("\\u0419");
                case 'К' -> System.out.print("\\u041A");
                case 'Л' -> System.out.print("\\u041B");
                case 'М' -> System.out.print("\\u041C");
                case 'Н' -> System.out.print("\\u041D");
                case 'О' -> System.out.print("\\u041E");
                case 'П' -> System.out.print("\\u041F");
                case 'Р' -> System.out.print("\\u0420");
                case 'С' -> System.out.print("\\u0421");
                case 'Т' -> System.out.print("\\u0422");
                case 'У' -> System.out.print("\\u0423");
                case 'Ф' -> System.out.print("\\u0424");
                case 'Х' -> System.out.print("\\u0425");
                case 'Ц' -> System.out.print("\\u0426");
                case 'Ч' -> System.out.print("\\u0427");
                case 'Ш' -> System.out.print("\\u0428");
                case 'Щ' -> System.out.print("\\u0429");
                case 'Ъ' -> System.out.print("\\u042A");
                case 'Ы' -> System.out.print("\\u042B");
                case 'Ь' -> System.out.print("\\u042C");
                case 'Э' -> System.out.print("\\u042D");
                case 'Ю' -> System.out.print("\\u042E");
                case 'Я' -> System.out.print("\\u042F");
                case 'а' -> System.out.print("\\u0430");
                case 'б' -> System.out.print("\\u0431");
                case 'в' -> System.out.print("\\u0432");
                case 'г' -> System.out.print("\\u0433");
                case 'д' -> System.out.print("\\u0434");
                case 'е' -> System.out.print("\\u0435");
                case 'ё' -> System.out.print("\\u0451");
                case 'ж' -> System.out.print("\\u0436");
                case 'з' -> System.out.print("\\u0437");
                case 'и' -> System.out.print("\\u0438");
                case 'й' -> System.out.print("\\u0439");
                case 'к' -> System.out.print("\\u043A");
                case 'л' -> System.out.print("\\u043B");
                case 'м' -> System.out.print("\\u043C");
                case 'н' -> System.out.print("\\u043D");
                case 'о' -> System.out.print("\\u043E");
                case 'п' -> System.out.print("\\u043F");
                case 'р' -> System.out.print("\\u0440");
                case 'с' -> System.out.print("\\u0441");
                case 'т' -> System.out.print("\\u0442");
                case 'у' -> System.out.print("\\u0443");
                case 'ф' -> System.out.print("\\u0444");
                case 'х' -> System.out.print("\\u0445");
                case 'ц' -> System.out.print("\\u0446");
                case 'ч' -> System.out.print("\\u0447");
                case 'ш' -> System.out.print("\\u0448");
                case 'щ' -> System.out.print("\\u0449");
                case 'ъ' -> System.out.print("\\u044A");
                case 'ы' -> System.out.print("\\u044B");
                case 'ь' -> System.out.print("\\u044C");
                case 'э' -> System.out.print("\\u044D");
                case 'ю' -> System.out.print("\\u044E");
                case 'я' -> System.out.print("\\u044F");
                case ' ' -> System.out.print("\\ ");
                default -> System.out.print(""); //неразрывный пробел u00A0
            }

    }
}

