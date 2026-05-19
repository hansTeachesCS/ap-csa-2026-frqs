public Account(String requestedName) {
  username = requestedName;
  int i = 0;
  while (!isAvailable(username)) {
    i++;
    username = requestedName + i;
  }
}
