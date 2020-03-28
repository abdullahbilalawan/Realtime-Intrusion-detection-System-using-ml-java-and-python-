#importing initial libraries


import pandas as pd 
import numpy as np
import sklearn



# importing dataframe

data = pd.read_csv("traindata.csv")



# dataframe spliting into x and y
Xtrain = data.drop(['Label'], axis=1)

Ytrain = data[['Label']].copy()

# splitting into train test

from sklearn.model_selection import train_test_split
X_train, X_test, Y_train, Y_test = train_test_split(Xtrain,Ytrain,test_size = 0.15,shuffle=True)



print(X_train.shape)
# applying knn classifier for fast and accurate results
from sklearn.neighbors import KNeighborsClassifier
from sklearn import metrics
#defing the model



model_knn = KNeighborsClassifier()
model_knn.fit(X_train, Y_train)

predict_knn = model_knn.predict(X_train)
print(predict_knn)
accuracy_train_knn = metrics.accuracy_score(Y_train,predict_knn)
print('accuracy_score on train dataset : ', accuracy_train_knn)



# importing the test dataset


test_data = pd.read_csv("features_1.csv")

test_data = test_data.drop(['Label'], axis=1)

print(test_data.shape)


# applying prediction from the model

predict_test = model_knn.predict(test_data)





#checking on results
packet_no_attack=[]
packet_no_normal=[]


for i in range(1,len(predict_test)):
   
    if predict_test[i]==1:
        packet_no_attack.append(i)

    else:
        packet_no_normal.append(i)







#summarazing and writing the results on the text



with open("Results_knn.txt","w+") as f:

    f.write("===================================================MODEL USED : KNN==================================================================="+"\n")
    f.write("model accuracy = "+str(accuracy_train_knn)+"\n")
    f.write("\n"*2)

    f.write("malware packets============================================::::"+"\n")
    f.write("no of malware packets"+str(len(packet_no_attack))+"\n")
    

    
    for x in packet_no_attack:
        f.write("Malware detected in packet no:"+str(x)+"\n"*2)


    f.write("Normal packets===============================================::::"+"\n")
    f.write("no of normal packets"+str(len(packet_no_normal))+"\n")
    

    for y in packet_no_normal:
        f.write("Normal Packet detected in packet no:"+str(y)+"\n")




    f.close()









