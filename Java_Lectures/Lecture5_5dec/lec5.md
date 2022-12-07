Хранение и обработка данных, чаcть II

Множество коллекций Map

Map – это множество коллекций, работающих с данными по принципу <Ключ / Значение>.

План:
Обзор функционала Map
Зачем нужен HashMap
HashMap и работа с ним
Обзор функционала TreeMap
Обзор функционала LinkedHashMap 
Примеры

1. HashMap

Hash-функция выдает какое-то значение (число).

Map – это множество коллекций, работающих с данными по принципу <Ключ / Значение>.

Ключевые особенности: 
допускаются только уникальные ключи, значения 
могут повторяться;
помните про null значения*;
ускоренная обработка данных;
порядок добавления не запоминается.

В HashMap элементы располагаются как угодно и могут менять свое положение.

Основной функционал:
put(K,V) – добавить пару если или изменить значение,если ключ имеется.
putIfAbsent(K,V) – произвести добавление если ключ не найден.
get(K) - получение значения по указанному ключу.
remove(K) – удаляет пару по указанному ключу.
containsValue(V) – проверка наличия значения.
containsKey(V) – проверка наличия ключа.
keySet() – возвращает множество ключей.
values() – возвращает набор значений.

Пример: Example1.java

Важное дополнение #1. Работа с парами (пример фор-ич)

Пример: Example2.java

Важное дополнение #2. Скорость
1. Можно указывать размер (если есть возможность заранее его определить). initialCapacity - начальная емкость
2. Указывать, по достижении какого процента заполнения, его надо увеличивать (в примере 0.8f - это 80%) load factor - коэффициент нагрузки

Пример: Example3.java

HashMap. Любознательным:

Хэш-функции и хэш-таблицы
Прямое связывание (хэширование с цепочками)
Хэширование с открытой адресацией
Теория графов:
    деревья построенные на списках
    бинарные деревья
    сбалансированные деревья
    *алгоритм балансировки дерева
    ** красно-черные деревья, деревья поиска

2. TreeMap

Используется, когда необходимо хранить данные в структурированном виде с возможностью навигации по ним.
Пары "ключ-значение" упорядочиваются по ключу!!!

Пример: Example4.java

Методы, на которые нужно обратить внимание:
put(K,V) добавить пару
get(K) получить значение по ключу
remove(K) удалить пару по ключу
descendingKeySet(V) получить набор ключей
descendingMap() показать в обратном порядке
tailMap() показать значения больше чем...
headMap() показать значения меньше чем...
lastEntry()
firstEntry()

firstKey(): возвращает ключ первого элемента мапы;
lastKey(): возвращает ключ последнего элемента;
headMap(K end): возвращает мапу, которая содержит все элементы текущей, от начала до элемента с ключом end;
tailMap(K start): возвращает мапу, которая содержит все элементы текущей, начиная с элемента start и до конца;
subMap(K start, K end): возвращает мапу, которая содержит все элементы текущей,начиная с элемента start и до элемента с ключом end.
firstEntry(): возвращает первый пару “ключ-значение”;
lastEntry(): возвращает последнюю пару “ключ-значение”;
pollFirstEntry(): возвращает и удаляет первую пару;
pollLastEntry(): возвращает и удаляет последнюю пару;
ceilingKey(K obj): возвращает наименьший ключ k, который больше или равен ключу obj. Если такого ключа нет, возвращает null;
floorKey(K obj): возвращает самый большой ключ k, который меньше или равен ключу obj. Если такого ключа нет, возвращает null;
lowerKey(K obj): возвращает наибольший ключ k, который меньше ключа obj. Если такого ключа нет, возвращает null;
higherKey(K obj): возвращает наименьший ключ k, который больше ключа obj. Если такого ключа нет, возвращает null;
ceilingEntry(K obj): аналогичен методу ceilingKey(K obj), только возвращает пару “ключ-значение” (или null);
floorEntry(K obj): аналогичен методу floorKey(K obj), только возвращает пару “ключ-значение” (или null);
lowerEntry(K obj): аналогичен методу lowerKey(K obj), только возвращает пару “ключ-значение” (или null);
higherEntry(K obj): аналогичен методу higherKey(K obj), только возвращает пару “ключ-значение” (или null);
descendingKeySet(): возвращает NavigableSet, содержащий все ключи, отсортированные в обратном порядке;
descendingMap(): возвращает NavigableMap, содержащую все пары, отсортированные в обратном порядке;
navigableKeySet(): возвращает объект NavigableSet, содержащий все ключи в порядке хранения;
headMap(K upperBound, boolean incl): возвращает мапу, которая содержит пары от начала и до элемента upperBound. Аргумент incl указывает, нужно ли включать элемент upperBound в возвращаемую мапу;
tailMap(K lowerBound, boolean incl): функционал похож на предыдущий метод, только возвращаются пары от lowerBound и до конца;
subMap(K lowerBound, boolean lowIncl, K upperBound, boolean highIncl): как и в предыдущих методах, возвращаются пары от lowerBound и до upperBound, аргументы lowIncl и highIncl указывают, включать ли граничные элементы в новую мапу.

3. LinkedHashMap

«Старший брат»  коллекции HashMap, который все помнит…
Помнит порядок добавления элементов ➜ более  медлительный

Пример: Example5.java

Если нужна скорость - используем HashMap
Если нужен порядок - используем LinkedHashMap

4. HashTable

«Устаревший брат»  коллекции HashMap, который не знает про null

Пример: Example6.java