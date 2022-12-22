# 디자인 패턴 연습
## 생성 관련 패턴
### Singleton Pattern
### Factory Method Pattern
### Abstract Factory Pattern
### Builder Pattern
### ProtoType Pattern
## 구조 관련 패턴
### Adapter Pattern
Bridge Pattern과 구조가 유사하므로 주의하여야 한다. Adapter라는 이름에서 디자인 패턴의 의도를 유추할 수 있다. 연관이 없는 두 인터페이스를 잇고자 사용하는 디자인 패턴이다.
Adaptee 인터페이스를 Target 인터페이스로 변환시키고자 한다. 이때, 중간에서 Adapter가 Adaptee에서 Target로의 변환을 가능하게 한다.

Reference: https://en.wikipedia.org/wiki/Adapter_pattern
### Bridge Pattern
Adapter Pattern과 구조가 유사하므로 주의하여야 한다. 추상과 구현을 분리하는 동시에, 둘을 잇고자 사용하는 디자인 패턴이다.
추상과 구현의 확실한 분리와 연결을 통해, 여러가지 추상 구현체와 여러가지 구현을 다양하게 조합할 수 있다.
보통 추상체가 구현체의 인터페이스를 필드로 가지고, 해당 구현체 인터페이스를 가지고 함수를 구현한다. 해당 추상체를 상속받은 여러 변이체가 존재하고, 
변이체는 각각 자신만의 구현을 가진다. 이때, 구현체로 추상체에 구현한 메소드를 사용하거나, 구현체의 접근 제어자가 protected나 public인 경우 구현체의 메소드를
직접 사용하여 구현을 할 수 있다.

Reference: https://en.wikipedia.org/wiki/Bridge_pattern 
### Composite Pattern
### Decorator Pattern
## 행동 관련 패턴