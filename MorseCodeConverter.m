MC_1 = '.----'; MC_2 = '..---'; MC_3 = '...--'; 

MC_4 = '....-'; MC_5 = '.....'; MC_6 = '-....'; 

MC_7 = '--...'; MC_8 = '---..'; MC_9 = '----.'; 

MC_0 = '-----'; MC_A = '.-'; MC_B = '-...';

MC_C = '-.-.'; MC_D = '-..'; MC_E = '.'; 

MC_F = '..-.'; MC_G = '--.'; MC_H = '....'; 

MC_I = '..'; MC_J = '.---'; MC_K = '-.-'; 

MC_L = '.-..'; MC_M = '--'; MC_N = '-.';

MC_O = '---'; MC_P = '.--.'; MC_Q = '--.-'; 

MC_R = '.-.'; MC_S = '...'; MC_T = '-'; 

MC_U = '..-'; MC_V = '...-'; MC_W = '.--'; 

MC_X = '-..-'; MC_Y = '-.--'; MC_Z = '--..';

MC_SPACE = '/';

Word = input('Enter string to be converted to Morse Code: ', 's'); 

Word = strtrim(upper(Word));

Valid = 1;
IsSpace = 0;
LastIsSpace = 0;

for i = 1 : length(Word);
    if Word(i) == ' '
        IsSpace = 1;
    else
        IsSpace = 0; LastIsSpace = 0;
    end
    
    if LastIsSpace == 0 || IsSpace == 0 
    
        switch(Word(i))

       case '1'
             Code = MC_1;

       case '2'

             Code = MC_2;

       case '3'

             Code = MC_3;

       case '4'

             Code = MC_4;

       case '5'

             Code = MC_5;

       case '6'

             Code = MC_6;

       case '7'

             Code = MC_7;

       case '8'

             Code = MC_8;

       case '9'

             Code = MC_9;

       case '0'

             Code = MC_0;

       case 'A'

             Code = MC_A;

       case 'B'

             Code = MC_B;

       case 'C'

             Code = MC_C;

       case 'D'

             Code = MC_D;

       case 'E'

             Code = MC_E;

       case 'F'

             Code = MC_F;

       case 'G'

             Code = MC_G;

       case 'H'

             Code = MC_H;

       case 'I'

             Code = MC_I;

       case 'J'

             Code = MC_J;

       case 'K'

             Code = MC_K;

       case 'L'

             Code = MC_L;

       case 'M'

             Code = MC_M;

       case 'N'

             Code = MC_N;

       case 'O'

             Code = MC_O;

       case 'P'

             Code = MC_P;

       case 'Q'

             Code = MC_Q;

       case 'R'

             Code = MC_R;

       case 'S'

             Code = MC_S;

       case 'T'

             Code = MC_T;

       case 'U'

             Code = MC_U;

       case 'V'

             Code = MC_V;

       case 'W'

             Code = MC_W;

       case 'X'

             Code = MC_X;

       case 'Y'

             Code = MC_Y;

       case 'Z'

             Code = MC_Z;

        case ' '
            Code = MC_SPACE; LastIsSpace = 1;

        otherwise

               Valid = 0;           
        end
        
        if Valid

            fprintf('%s ', Code);

        else 

            disp('Input has invalid characters');
        end
    end
end
