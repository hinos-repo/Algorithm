package test;

import static javafx.scene.input.KeyCode.T;

public final class MyUtil
{
    public static String toString(int [] result)
    {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i<result.length; i++)
        {
            builder.append(result[i]);
            if (i < result.length-1)
            {
                builder.append(", ");
            }
        }
        builder.append("]");
        return new String(builder);
    }

    public static String toString(long [] result)
    {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i<result.length; i++)
        {
            builder.append(result[i]);
            if (i < result.length-1)
            {
                builder.append(", ");
            }
        }
        builder.append("]");
        return new String(builder);
    }

    public static String toString(boolean [] result)
    {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i<result.length; i++)
        {
            builder.append(result[i]);
            if (i < result.length-1)
            {
                builder.append(", ");
            }
        }
        builder.append("]");
        return new String(builder);
    }

    public static String toString(float [] result)
    {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i<result.length; i++)
        {
            builder.append(result[i]);
            if (i < result.length-1)
            {
                builder.append(", ");
            }
        }
        builder.append("]");
        return new String(builder);
    }

    public static String toString(double [] result)
    {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i<result.length; i++)
        {
            builder.append(result[i]);
            if (i < result.length-1)
            {
                builder.append(", ");
            }
        }
        builder.append("]");
        return new String(builder);
    }

}
