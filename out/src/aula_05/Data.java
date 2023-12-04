// package aula_05;

// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.time.format.DateTimeFormatter;

// public class Data {
//     public static void main(String[] args) {
//         // LocalDate, LocalTime
//         LocalDate dataAtual = LocalDate.now();
//         System.out.println(dataAtual);

//         LocalTime horaAtual = LocalTime.now();
//         System.out.println(horaAtual);

//         DateTimeFormatter formatador = DateTimeFormatter.ofPattern
//         ("dd/MM/yyyy");

//         DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern
//         ("HH:mm:ss");

//         String dataFormatada = formatador.format(dataAtual);
//         System.out.println(dataFormatada);

//         String horaFormatada = formatador2.format(horaAtual);
//         System.out.println(horaFormatada);

//         LocalDateTime dataHoraAtual = LocalDateTime.now();
//         System.out.println(dataHoraAtual);

//         DateTimeFormatter formatador3 = DateTimeFormatter.ofPattern
//         ("dd/MM/yyyy HH:mm:ss");
//         System.out.println(formatador3.format(dataHoraAtual));

//         LocalDate natal = LocalDate.of(2023, 12, 25);
//         System.out.println(formatador.format(natal));

//         LocalTime almoco = LocalTime.of(12, 0, 0);
//         System.out.println(formatador2.format(almoco));

//         LocalDate anoNovo = LocalDate.parse("2024-01=01");
//         System.out.println(formatador.format(anoNovo));

//         LocalTime meiaNoite = LocalTime.parse("00:00:00");
//         System.out.println(formatador2.format(meiaNoite));

//         // meiaNoite = meiaNoite.plusHours(2);
//         // meiaNoite = meiaNoite.plusMinutes(45);
//         // meiaNoite = meiaNoite.plusSeconds(30);
//         // System.out.println(formatador2.format(meiaNoite));

//         natal = natal.plusDays(7);
//         System.out.println(formatador.format(natal));
// }
