// Lab4.java
class Lab4 {

    interface Iterator {
        boolean hasNext();
        Object next();
    }

    interface Container {
        Iterator getIterator();
    }

    static class NameRepository implements Container {
        public String[] names = {"John", "Jane", "Jack", "Jill"};

        public Iterator getIterator() {
            return new NameIterator();
        }

        private class NameIterator implements Iterator {
            int index;

            public boolean hasNext() {
                return index < names.length;
            }

            public Object next() {
                if (this.hasNext()) {
                    return names[index++];
                }
                return null;
            }
        }
    }

    public void demonstrate() {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }
    }
}
