### Java Iterator

#### Tüm Java koleksiyonları bir iterator() yöntemi içerir. Bu yöntem, koleksiyon öğeleri üzerinde gezinme yapmak için kullanılan bir yineleyici örneğini döndürür.

#### Iterator arabirimi, koleksiyon öğeleri üzerinde çeşitli işlemleri gerçekleştirmek için kullanılabilecek 4 yöntem sağlar.


1. `hasNext()` – Koleksiyonda bir öğe varsa true değer döndürür.
2. `next()` – Koleksiyonun bir sonraki öğesini dönderir.
3. `remove()` – next() tarafından döndürülen son öğeyi kaldırır.
4. `forEachRemaining()` - koleksiyonun kalan her öğesi için belirtilen eylemi gerçekleştirir.
