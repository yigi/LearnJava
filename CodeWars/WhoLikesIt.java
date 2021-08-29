public static String whoLikesIt(String... names) 
{
  StringBuilder message = new StringBuilder();
  int othersSize = 0;
  if(names.length == 0)
  {
    message.append("no one likes this");
  }
  if(names.length == 1)
  {
    message.append(names[0]);
    message.append(" likes this");
  }
  else if(names.length == 2)
  {
    message.append(names[0]);
    message.append(" and ");
    message.append(names[1]);
    message.append(" like this");
  }
  else if(names.length == 3)
  {
    message.append(names[0]);
    message.append(", ");
    message.append(names[1]);
    message.append(" and ");
    message.append(names[2]);
    message.append(" like this");
  }
  else if( names.length > 3)
  {
    othersSize = names.length - 2;
    message.append(names[0]);
    message.append(", ");
    message.append(names[1]);
    message.append(" and ");
    message.append(String.valueOf(othersSize) + " others");
    message.append(" like this");
  }
  else
  {
    message.append("");
  }
  return message.toString();
}