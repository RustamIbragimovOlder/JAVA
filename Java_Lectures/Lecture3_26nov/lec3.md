Тип данных Object – «всему голова»
Упаковка – любой тип можно положить в переменную типа Object
Распаковка – преобразование Object-переменной в нужный тип
Иерархия типов – любой тип «ниже» Object’а

пример: Example1.java

Проблема. Как увеличить размер массива?
Есть массив из 2 элементов

пример: Example2.java
Вариант 1 ПЛОХОЙ
Вариант 2 ХОРОШИЙ

Иерархия коллекций:
<<interface>> Collection:
    1. <<interface>> Set расширяет Collection:
        1.1. HashSet: реализовывает Set
            1.1.1. LinkedHashSet: расширяет HashSet
        1.2. <<interface>> SortedSet: расширяет Set
            1.2.1. <<interface>> NavigabledSet: расширяет SortedSet
                1.2.1.1. TreeSet: реализовывает NavigabledSet
    
    2. <<interface>> List расширяет Collection:
List – пронумерованный набор элементов.
Пользователь этого интерфейса имеет точный контроль над тем, где в списке вставляется каждый элемент.
Пользователь может обращаться к элементам по их целочисленному индексу (позиции в списке) и искать элементы в списке.

        2.1. ArrayList: реализовывает List
"удобный массив"
Разные способы создания
например
ArrayList list = new ArrayList();
ArrayList<Integer> list1 = new ArrayList<Integer>();
ArrayList<Integer> list2 = new ArrayList<>();
ArrayList<Integer> list3 = new ArrayList<>(10);
ArrayList<Integer> list4 = new ArrayList<>(list3);

        2.2. Vector: реализовывает List
                
    3. <<interface>> Queue расширяет Collection:
        3.1. LinkedList: реализовывает Queue and List 
        3.2. PriorityQueue: реализовывает Queue
                
    + коллекции MAP отдельно от всех

Коллекции. Функционал

add(args) – добавляет элемент в список (в т.ч. на нужную позицию)
get(pos) – возвращает элемент из списка по указанной позиции
indexOf(item) – первое вхождение или -1
lastIndexOf(item) – последнее вхождение или -1
remove(pos) – удаление элемента на указанной позиции и его возвращение
set(int pos, T item) – gjvtoftn значение item элементу, который находится на позиции pos
void sort(Comparator) – сортирует набор данных по правилу
subList(int start, int end) – получение набора данных от позиции start до end
clear() – очистка списка
toString() – «конвертация» списка в строку
Arrays.asList – преобразует массив в список
containsAll(col) – проверяет включение всех элементов из col
removeAll(col) – удаляет элементы, имеющиеся в col
retainAll(col) – оставляет элементы, имеющиеся в col
toArray() – конвертация списка в массив Object’ов
toArray(type array) – конвертация списка в массив type
List.copyOf(col) – возвращает копию списка на основе имеющегося
List.of(item1, item2,...) – возвращает неизменяемый список

Итератор
Получение итератора с целью более гибкой работы с данными URL
Интерфейс Iterator<E>. Итератор коллекцией.
Iterator занимает место Enumeration в Java Collections Framework.
Итераторы отличаются от перечислений двумя способами:
Итераторы позволяют вызывающей стороне удалять элементы из базовой коллекции во время итерации с четко определенной семантикой.

hasNext(), next(), remove()

ListIterator<E> URL

hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)


      