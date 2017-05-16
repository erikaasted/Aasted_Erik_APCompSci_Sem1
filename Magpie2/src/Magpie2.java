import java.util.Scanner;
public class Magpie2
{

	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	

	public String getResponse(String statement)
	{
		String response;
		if (statement.length() == 0)
        {
            response = "Say something, please.";
        }

		else if (findKeyword(statement.toLowerCase(), "no",0) >= 0)
		{
			response = "Why so negative?";
		}

		else if ((findKeyword(statement.toLowerCase(), "mother", 0) >= 0)
                || (findKeyword(statement.toLowerCase(), "father", 0) >= 0)
                || (findKeyword(statement.toLowerCase(), "sister", 0) >= 0)
                || (findKeyword(statement.toLowerCase(), "brother", 0) >= 0))
		{
			response = "Tell me more about your family.";
		}

		else if ((findKeyword(statement.toLowerCase(), "cat", 0) >= 0)
            || (findKeyword(statement.toLowerCase(), "dog", 0) >= 0)
            || (findKeyword(statement.toLowerCase(), "fish", 0) >= 0)
            || (findKeyword(statement.toLowerCase(), "turtle", 0) >= 0))
        {
            response = "Tell me more about your pets.";
        }

        else if (findKeyword(statement.toLowerCase(), "robinette", 0) >= 0)
        {
            response = "He sounds like a pretty dank teacher.";
        }

		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}

		else
		{
			int psn = findKeyword(statement, "you", 0);


			if ((psn >= 0) && (findKeyword(statement, "me", psn) >= 0))
			{
				response = transformYouMeStatement(statement);
			}
			else if ((findKeyword(statement, "I", 0)>= 0) && (findKeyword(statement, "You", findKeyword(statement, "I", 0)) >= 0))
            {
                response = transformIYouStatement(statement);
            }
			else
			{
				response = getRandomResponse();
			}
		}
		return response;
	}


    private String transformIWantToStatement(String statement)
    {
        statement = statement.trim().toLowerCase();
        String lastChar = "" + statement.charAt(statement.length() - 1);

        if (lastChar.equals("."))
            statement = statement.substring(0, statement.length() - 1);

        int psn = findKeyword(statement, "i want to ");

        String[] parts = statement.split("i want to ");
        String restOfStatement = parts[1];

        return "What would it mean to " + restOfStatement + "?";
    }


    private String transformYouMeStatement(String statement)
    {
        statement = statement.trim().toLowerCase();
        String lastChar = "" + statement.charAt(statement.length()-1);

        if (lastChar.equals("."))
            statement = statement.substring(0, statement.length() - 1);

        int psnOfYou = findKeyword(statement, "you");
        int psnOfMe = findKeyword(statement, "me", psnOfYou + 3);

        String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe);

        return "What makes you think that I" + restOfStatement + "you?";
    }


    private String transformIYouStatement(String statement)
    {
        statement = statement.trim().toLowerCase();
        String lastChar = "" + statement.charAt(statement.length()-1);

        if (lastChar.equals("."))
            statement = statement.substring(0, statement.length() - 1);

        int psnOfi = findKeyword(statement, "i");
        int psnOfyou = findKeyword(statement, "you", psnOfi + 1);

        String restOfStatement = statement.substring(psnOfi + 1, psnOfyou);

        return "Why do you" + restOfStatement + "me?";
    }


	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.toLowerCase().trim();
        goal = goal.toLowerCase().trim();
		int psn = phrase.indexOf(goal, startPos);

		while (psn >= 0)
        {
            String before = "";
            String after = "";

            if (psn > 0)
            {
                before = phrase.substring(psn - 1, psn);
            }

            if (phrase.length() > goal.length() + psn)
            {
                after = phrase.substring(psn + goal.length(), psn + goal.length()+1);
            }

            if ((before.compareTo("a") < 0 || before.compareTo("z") > 0) &&
                    (after.compareTo("a") < 0 || after.compareTo("z") > 0))
            {
                return psn;
            }

            psn = phrase.indexOf(goal, psn + 1);
        }

        return -1;

	}

	private int findKeyword(String statement, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(statement, goal, 0);
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}
