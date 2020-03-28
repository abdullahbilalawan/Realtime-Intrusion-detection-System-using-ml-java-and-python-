from CreateFeaturesHandler import CreateFeaturesHandler

def main():
    cfh = CreateFeaturesHandler(single_csv=True)
    cfh.compute_features()

if __name__== "__main__":
    main()